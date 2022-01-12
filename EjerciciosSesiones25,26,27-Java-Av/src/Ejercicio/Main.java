package Ejercicio;

import Ejercicio.Entities.CocheCombustion;
import Ejercicio.Entities.CocheElectrico;
import Ejercicio.Entities.CocheHibrido;
import Ejercicio.EntitiesInterfaces.CochesCompletos;
import Ejercicio.Repositories.CochesDB;
import Ejercicio.Repositories.CochesFichero;

//**********OJO!!!!Líneas 6 y 7. Comentar una u otra para comprobar que funciona tanto en fichero como en memoria
public class Main {
    public static void main(String[] args) {

//        CochesDB db = new CochesMemoria();
        CochesDB db = new CochesFichero();

        //Creamos los coches (método antíguo "paso de valor" sustituido por builder)
        //He implementado el patron builder para poder usar programación funcional
        CocheElectrico electrico = new CocheElectrico().setConsumo(10).setCargaActual(75);
        CocheHibrido hibrido = new CocheHibrido().setConsumoEl(10).setCargaActual(30)
                .setTipoCombustible("Gasolina").setLitrosEnDeposito(30).setConsumoCombustible(6);
        CocheCombustion combustion = new CocheCombustion().setTipoCombustible("Gasoil").setConsumo(6)
                .setLitrosEnDeposito(25);
        //Inicializo valores de la clase Coche para comprobar que se puede acceder y modificar
        electrico.coche.setMarca("tesla").setModelo("T").setMatricula("1255FGS").setAñoMatriculacion(2015);
        hibrido.coche.setMarca("Toyota").setModelo("Prius").setMatricula("8566FLT").setAñoMatriculacion(2019);
        combustion.coche.setMarca("Skoda").setModelo("Octavia").setMatricula("7421CMD").setAñoMatriculacion(2007);

        //los añado DB
        db.insertar(electrico);
        db.insertar(hibrido);
        db.insertar(combustion);

        //Muestro para cada coche el estado Arrancado o no
        for(CochesCompletos cocheActual : db.obtener()){
            System.out.println("El coche marca: " +  cocheActual.getCoche().getMarca()+
                    " ¿Esta arrancado? " + cocheActual.getCoche().getEstaArrancado());
        }

        // Para comprobar luego que sucede si uno ya está arrancado y, que el estado de uno no afecta a los demás
        combustion.arrancar();
        db.actualizarCoche(combustion);

        //Arrancamos todos los coches
        System.out.println("\n--Tratando de arrancar todos los coches.");
        for(CochesCompletos cocheActual : db.obtener()){
            cocheActual.arrancar();
            db.actualizarCoche(cocheActual);
        }

        //Obtenemos cuantos km es capaz de recorrer cada coche según (nivel actual del tanque y/o batería)
        // y (consumo de cada tipo)
        System.out.println("\n--¿Cuantos km le quedan a cada coche?");
        for(CochesCompletos cocheActual : db.obtener()){
            System.out.println("El coche marca: " +  cocheActual.getCoche().getMarca() + " puede recorrer "
                    + cocheActual.kmEstimados() + " kms aproximados");
        }

        //Intento arrancar todos los coches de nuevo para comprobar como se comporta el código
        System.out.println("\n--Tratando de arrancar todos los coches.");
        for(CochesCompletos cocheActual : db.obtener()){
            cocheActual.arrancar();
            db.actualizarCoche(cocheActual);
        }

        //Apagamos todos los coches
        System.out.println("\n--Tratando de apagar todos los coches.");
        for(CochesCompletos cocheActual : db.obtener()){
            cocheActual.apagar();
            db.actualizarCoche(cocheActual);
        }

        //Apagamos todos los coches DE NUEVO para comprobar que sucede
        System.out.println("\n--Tratando de apagar todos los coches.");
        for(CochesCompletos cocheActual : db.obtener()){
            cocheActual.apagar();
            db.actualizarCoche(cocheActual);
        }
    }
}
