package Adapter;

/**
 * El patrón Adaptador, crea una clase que permite que:
 * (clases con la misma implementación) y (clases con diferente implementación)
 * FUNCIONEN COHERENTEMENTE (ejemplos: los adaptadores para enchufes diferentes)
 */
public class Main {
    public static void main(String[] args) {
        //Probamos a crear los electrodomésticos normales
        Horno fagor = new Horno();
        Lampara luz = new Lampara();
/**
* OJO!! Al crear un objeto que no implementa la interfaz (no enchufable) hay que usar el adaptador,
* el cual se encargará de crear el electrodoméstico no enchufable pero adaptándolo
*/
        PowerAdapter bombillaI = new PowerAdapter();


        //Encendemos todos
        enciende(fagor);
        enciende(luz);
        enciende(bombillaI);
        //Ejecutamos la función estaEncendido?
        System.out.println("Horno fagor encendido?: "+estaEncendido(fagor)); //también se podría poner horno.estaEncendido()
        System.out.println("Lampara luz encendida?: "+estaEncendido(luz));
        System.out.println("Bombilla Inglesa encendido?: "+estaEncendido(bombillaI));

        //Apagamos todos
        apaga(fagor);
        apaga(luz);
        apaga(bombillaI);
        //Ejecutamos la función estaEncendido?
        System.out.println("Horno fagor encendido?: "+fagor.estaEncendido());
        System.out.println("Lampara luz encendida?: "+luz.estaEncendido());
        System.out.println("Bombilla Inglesa encendido?: "+bombillaI.estaEncendido());




    }

/** *********MUY IMPORTANTE*********
 * Fuera del main:
* Creamos el envoltorio del patrón
 *-Servirá tanto para las clases que implementan la interfaz, como para las que necesitan ser adaptadas(LightBulb)
 *-Deberá ejecutar los métodos de la siguiente forma:
 **/
//Maqueta:
//public static devuelve_algo_ó_void método_en_interfaz (NombreInterfaz objeto_tipo_interfaz){
//objeto_tipo_interfaz.método_en_interfaz();
//}

    public static void enciende(Enchufable enchufable){
        enchufable.enciende();
    }
    public static void apaga(Enchufable enchufable){
        enchufable.apaga();
    }
    public static boolean estaEncendido(Enchufable enchufable){
        return enchufable.estaEncendido();
    }

}
