package Factory;

/**
 * El patrón factory sirve para crear una jerarquía de clases
 * diferentes clases que implementan la interfaz de maneras distintas
 *
 * 1º Creamos la interfaz que definirá los métodos que deben implementas las clases (Precio).
 * 2º Creamos las clases que implementarán la interfaz, dependiendo de nuestros intereses (PrecioUSD y PrecioEuro)
 * 3º -Creamos el InterfazFactory (PrecioFactory)
 *     -(PrecioFactory): crear un constructor PRIVATE (para que quede inaccesible) sin parámetros.
 *     -(PrecioFactory):Crear un objeto Envoltorio del tipo (nuestraInterfaz)
 *     -(PrecioFactory):Crear otro constructor con el/los parámetros que nos interesen (Le llamaremos constructor Standard)
 *     -(PrecioFactory):En nuestro constructor Standard:
 *          -Asignarle a nuestro objeto Envoltorio la clase implementadora que nos interese según el/los parámetros que le pasen
 *
 */
public class Main {
    public static void main(String[] args) {


        PrecioFactory precio = new PrecioFactory("España");
        System.out.println(precio.precio.getPrecio()+ " Precio desde Main.");

        PrecioFactory precio2 = new PrecioFactory("EEUU");
        System.out.println(precio2.precio.getPrecio()+ " Precio2 desde Main.");

        PrecioFactory precio3 = new PrecioFactory("uk");
        System.out.println(precio3.getPrice()+" Precio3 desde Main.");  //He implementado método en PrecioFactory para no tener
        // que poner precio3.precio.getPrecio()

    }
}
