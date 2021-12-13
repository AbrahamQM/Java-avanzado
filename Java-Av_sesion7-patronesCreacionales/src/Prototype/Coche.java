package Prototype;

/**
 * Patrón PROTOTYPE sin interfaz
 */
//public class Coche {
////Atributos
//    public String marca;
//    public String modelo;
//    public int puertas;
////Métodos
//    public Coche(){} //constructor vacío
//
//    /**
//     * método clonar es la clave del patrón
//     */
//    public Coche clonar(){
//        Coche clon = new Coche();//creamos una instancia de la propia clase
//        clon.marca = marca;
//        clon.modelo = modelo;
//        clon.puertas = puertas;
//
//        return clon;
//    }
//
//}
/**
 * PATRÓN PROTOTYPE con Interfaz
 *
 */

public class Coche implements Cloneable{
    //Atributos
    public String marca;
    public String modelo;
    public int puertas;
    //Métodos
    public Coche(){} //constructor vacío

    /**
     * método clonar es la clave del patrón
     */
    public Coche clonar() throws CloneNotSupportedException{ //Hay que lanzar la excepción "CloneNot....." por si no es clonable
        return (Coche)this.clone(); //clone es parte de la interfaz Cloneable, hay que hacer un "Cast" para modificar el
        // tipo de objeto que devuelve
    }

}