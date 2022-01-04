package Ejercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList();

        /**Demostraciones principio de Liskov**/
        //Instanciamos objetos de cada clase con la clase hija CocheMejorado(intermedia) Opción 1:
//        CocheMejorado electrico = new CocheElectrico(10, 75);
//        CocheMejorado hibrido = new CocheHibrido(10, 30, "Gasolina", 30, 6);
//        CocheMejorado combustion = new CocheCombustion("Gasoil", 6, 25);

        //Instanciar objetos de la Clase Coche(padre) Opción 2:
//        Coche electrico = new CocheElectrico(10, 75);
//        Coche hibrido = new CocheHibrido(10, 30, "Gasolina", 30, 6);
//        Coche combustion = new CocheCombustion("Gasoil", 6, 25);

        //Instanciar objetos de las Clases hijas (finales) Opción 3:
        CocheElectrico electrico = new CocheElectrico(10, 75);
        CocheHibrido hibrido = new CocheHibrido(10, 30, "Gasolina", 30, 6);
        CocheCombustion combustion = new CocheCombustion("Gasoil", 6, 25);
        /**Fin demostraciones**/

        //Inicializo valores de la clase Coche para comprobar que se puede acceder y modificar
        electrico.marca = "tesla";
        electrico.matricula = "1255DFC";
        electrico.modelo = "T";
        electrico.añoMatriculacion = 2015;

        hibrido.marca = "Toyota";
        hibrido.modelo = "prius";
        hibrido.matricula = "8566FLT";
        hibrido.añoMatriculacion = 2019;

        combustion.marca = "Skoda";
        combustion.modelo = "Octavia";
        combustion.matricula = "7421CMD";
        combustion.añoMatriculacion = 2007;

        //los añado al array para trabajar con todos a la vez
        coches.add(electrico);
        coches.add(hibrido);
        coches.add(combustion);

        //Muestro para cada coche el estado Arrancado o no
        for(Coche cocheActual : coches){
            System.out.println("El coche marca: " + cocheActual.marca + " ¿Esta arrancado? " + cocheActual.estaArrancado);
        }

        // Para comprobar luego que sucede si uno ya está arrancado y, que el estado de uno no afecta a los demás

        combustion.arrancar();
        //Arrancamos todos los coches
        System.out.println("\n--Tratando de arrancar todos los coches.");
        for(Coche cocheActual : coches){
            cocheActual.arrancar();
        }

        //Obtenemos cuantos km es capaz de recorrer cada coche según (nivel actual del tanque y/o batería)
        // y (consumo de cada tipo)
        System.out.println("\n--¿Cuantos km le quedan a cada coche?");
        for(Coche cocheActual : coches){
            System.out.println("El coche marca: " + cocheActual.marca + " puede recorrer "
                    + cocheActual.kmEstimados() + " kms aproximados");
        }

        //Intento arrancar todos los coches de nuevo para comprobar como se comporta el código
        System.out.println("\n--Tratando de arrancar todos los coches.");
        for(Coche cocheActual : coches){
            cocheActual.arrancar();
        }
        
        //Apagamos todos los coches
        System.out.println("\n--Tratando de apagar todos los coches.");
        for(Coche cocheActual : coches){
            cocheActual.apagar();
        }

        //Apagamos todos los coches DE NUEVO para comprobar que sucede
        System.out.println("\n--Tratando de apagar todos los coches.");
        for(Coche cocheActual : coches){
            cocheActual.apagar();
        }

    }
}
