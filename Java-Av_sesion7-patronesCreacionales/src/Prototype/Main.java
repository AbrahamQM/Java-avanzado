package Prototype;

/**
 * PATRÓN PROTOTYPE
 * Tiene como objetivo, clonarse a si mismo. Es decir que una clase se clone a sí misma y que ese clon herede todos los
 * métodos, las propiedades y su estado actual(en el momento de clonarse).
 */
public class Main {
    public static void main(String[] args) {
        //Creamos un coche para probar a clonarlo
        Coche coche = new Coche();
        coche.marca="Skoda";
        coche.modelo = "Octavia";
        coche.puertas =5;


        System.out.println(coche.marca + " "+coche.modelo+" Puertas: "+coche.puertas);
/**
 * Uso del patron prototype SIN INTERFAZ
 */
//        //clonamos el coche
//        Coche clonado = coche.clonar();
//        System.out.println(clonado.marca + " "+clonado.modelo+" Puertas: "+clonado.puertas);
//        //modificamos un valor
//        clonado.puertas=3;
//        System.out.println(clonado.marca + " "+clonado.modelo+" Puertas: "+clonado.puertas);
/**
 * Uso del patron prototype CON INTERFAZ Cloneable
 */
        //clonamos el coche pero en esta ocasión tenemos que implementar también la gestión de errores
        try {
            Coche clonado = coche.clonar();

            System.out.println(clonado.marca + " " + clonado.modelo + " Puertas: " + clonado.puertas);
            //modificamos un valor
            clonado.puertas = 3;
            System.out.println(clonado.marca + " " + clonado.modelo + " Puertas: " + clonado.puertas);
        }catch (CloneNotSupportedException e){
            System.out.println("No se puede clonar, Exepción: " + e.getMessage());
        }



    }
}
