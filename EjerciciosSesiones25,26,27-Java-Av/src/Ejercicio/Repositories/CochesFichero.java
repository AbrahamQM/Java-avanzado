package Ejercicio.Repositories;

import Ejercicio.Entities.CocheCombustion;
import Ejercicio.Entities.CocheElectrico;
import Ejercicio.Entities.CocheHibrido;
import Ejercicio.EntitiesInterfaces.CochesCompletos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CochesFichero implements CochesDB{

    public String ficheroDatos = "src/Ejercicio/RepositoryFiles/Coches.txt";

    @Override
    public CochesCompletos buscar(CochesCompletos coche) {
        ArrayList<CochesCompletos> coches = obtener();

        for (CochesCompletos cocheActual : coches) {
            if (cocheActual.getCoche().getModelo().equalsIgnoreCase(coche.getCoche().getModelo())) {
                return cocheActual;
            }
        }
        return null;
    }

    @Override
    public void insertar(CochesCompletos coche) {

        if(buscar(coche) == null) {
            //Forma de escribir en fichero implementada por VRoman en las sesiones
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos, true);
                PrintStream printStream = new PrintStream(fileOutputStream);
                printStream.println(separarCochePorComas(coche));
                printStream.flush();
                printStream.close();
            } catch (Exception e) {
                System.out.println("Error al insertar " + e.getMessage());
            }
/*----FUNCIONA, forma implementada por mí de insertar un nuevo elemento(Dejo la del profesor xq es más corta)----
          FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                File file = new File(ficheroDatos);
                if (!file.exists()){ //Si no existiera el fichero, se crea
                    file.createNewFile();
                }else{

                }

                fw = new FileWriter(file.getAbsoluteFile(), true);//true indica añadir en lugar de sobreescribir
                bw = new BufferedWriter(fw);

                bw.write("\n"+separarCochePorComas(coche));

                System.out.println("Coche insertado modelo: " + coche.getCoche().getModelo());
            } catch (Exception e) {
                System.out.println("Error al añadiendo el coche al fichero: " + e.getStackTrace());
            } finally {
                if (bw != null)
                    try {
                        bw.close();
                    }catch (Exception e) {}
                if (fw != null)
                    try {
                        fw.close();
                    }catch (Exception e) {}
            }*/

        }
    }

    @Override
    public void borrar(CochesCompletos coche) {
        ArrayList<CochesCompletos> coches = obtener();

        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getCoche().getMatricula().equalsIgnoreCase(coche.getCoche().getMatricula())) {
                coches.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (CochesCompletos cocheActual : coches) {
                String cocheComas = separarCochePorComas(cocheActual);
                printStream.println(cocheComas);

            }
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
            System.out.println("Error al borrar coche en fichero" + e.getMessage());
        }

    }

    @Override
    public ArrayList<CochesCompletos> obtener() {
        ArrayList<CochesCompletos> coches = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String cocheActual = scanner.next();
                String []partes = cocheActual.split(",");
                CochesCompletos coche = null;
                switch (partes[0]) {
                    case "combustión" ->
                    //Esquema Coche combustión:0 tipo,1 marca,2 modelo,3 matrícula,4 añoMatriculación,5 estaArrancado,
                    // 6 litrosEnDeposito,7 consumo,8 tipoCombustible.
                            coche = new CocheCombustion()
                                    .setLitrosEnDeposito(Integer.parseInt(partes[6]))
                                    .setConsumo(Integer.parseInt(partes[7]))
                                    .setTipoCombustible(partes[8]);
                    case "eléctrico" ->
                    //Esquema Coche eléctrico:0 tipo,1 marca,2 modelo,3 matrícula,4 añoMatriculación,
                    // 5 estaArrancado,6 cargaActual,7 consumo.
                            coche = new CocheElectrico()
                                    .setCargaActual(Integer.parseInt(partes[6]))
                                    .setConsumo(Integer.parseInt(partes[7]));
                    case "híbrido" ->
                    //Esquema Coche combustión:0 tipo,1 marca,2 modelo,3 matrícula,4 añoMatriculación,5 estaArrancado,
                    // 6 litrosEnDeposito,7 consumoCombustible,8 tipoCombustible,9 cargaActual,10 consumoEl.
                            coche = new CocheHibrido()
                                    .setLitrosEnDeposito(Integer.parseInt(partes[6]))
                                    .setConsumoCombustible(Integer.parseInt(partes[7]))
                                    .setTipoCombustible(partes[8])
                                    .setCargaActual(Integer.parseInt(partes[9]))
                                    .setConsumoEl(Integer.parseInt(partes[10]));
                    default -> System.out.println("Tipo de coche erróneo.");
                }

                coche.getCoche().setTipo(partes[0])
                        .setMarca(partes[1])
                        .setModelo(partes[2])
                        .setMatricula(partes[3])
                        .setAñoMatriculacion(Integer.parseInt(partes[4]))
                        .setEstaArrancado(Boolean.parseBoolean(partes[5]));
//                        .setEstaArrancado(Boolean.getBoolean(partes[5]));

                coches.add(coche);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error al obtener coches de fichero" + e.getMessage());
        }

        return coches;
    }


    private String separarCochePorComas(CochesCompletos coche) {
        String cocheComas="";
        switch (coche.getCoche().getTipo()) {
            case "combustión" ->
                    //Esquema Coche combustión:0 tipo,1 marca,2 modelo,3 matrícula,4 añoMatriculación,5 estaArrancado,
                    // 6 litrosEnDeposito,7 consumo,8 tipoCombustible.
                    cocheComas = coche.getCoche().getTipo()
                            + "," + coche.getCoche().getMarca()
                            + "," + coche.getCoche().getModelo()
                            + "," + coche.getCoche().getMatricula()
                            + "," + coche.getCoche().getAñoMatriculacion()
                            + "," + coche.getCoche().getEstaArrancado()
                            + "," + ((CocheCombustion) coche).getLitrosEnDeposito()
                            + "," + ((CocheCombustion) coche).getConsumo()
                            + "," + ((CocheCombustion) coche).getTipoCombustible();
            case "eléctrico" ->
                    //Esquema Coche eléctrico:0 tipo,1 marca,2 modelo,3 matrícula,4 añoMatriculación,
                    // 5 estaArrancado,6 cargaActual,7 consumo.
                    cocheComas = coche.getCoche().getTipo()
                            + "," + coche.getCoche().getMarca()
                            + "," + coche.getCoche().getModelo()
                            + "," + coche.getCoche().getMatricula()
                            + "," + coche.getCoche().getAñoMatriculacion()
                            + "," + coche.getCoche().getEstaArrancado()
                            + "," + ((CocheElectrico) coche).getCargaActual()
                            + "," + ((CocheElectrico) coche).getConsumo();
            case "híbrido" ->
                //Esquema Coche combustión:0 tipo,1 marca,2 modelo,3 matrícula,4 añoMatriculación,5 estaArrancado,
                // 6 litrosEnDeposito,7 consumoCombustible,8 tipoCombustible,9 cargaActual,10 consumoEl.
                cocheComas = coche.getCoche().getTipo()
                        + "," + coche.getCoche().getMarca()
                        + "," + coche.getCoche().getModelo()
                        + "," + coche.getCoche().getMatricula()
                        + "," + coche.getCoche().getAñoMatriculacion()
                        + "," + coche.getCoche().getEstaArrancado()
                        + "," + ((CocheHibrido) coche).getLitrosEnDeposito()
                        + "," + ((CocheHibrido) coche).getConsumoCombustible()
                        + "," + ((CocheHibrido) coche).getTipoCombustible()
                        + "," + ((CocheHibrido) coche).getCargaActual()
                        + "," + ((CocheHibrido) coche).getConsumoEl();


        }

        return cocheComas;
    }

    @Override
    public void actualizarCoche(CochesCompletos coche) {
        borrar(coche);
        insertar(coche);
    }
}
