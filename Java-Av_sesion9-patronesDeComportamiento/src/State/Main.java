package State;

/**
 * Patrón State(estado):
 * Implementamos una clase abstracta (Estado) con una serie de funciones.
 * Cada función va a realizar un cometido, una función, va a permitir cambiar el estado a la siguiente función
 * y así sucesivamente.
 * De manera que no podremos saltar de un estado al otro sin pasar por los estados intermedios y serán los métodos del
 * estado los encargados de cambiar el estado.
 *
 */

public class Main {
    public static void main(String[] args) {
        //Creamos objetos teléfono que se iniciarán como bloqueado
        Telefono tel1=new Telefono();


        System.out.println(tel1.estado.hacerFoto()); //Intentamos hacer una foto

        //Como no puede, vamos a intentar Abrir la Cámara
        System.out.println(tel1.estado.abrirCamara());

        //desbloqueamos el móvil
        System.out.println("----------Desbloqueamos el movil---------");
        System.out.println(tel1.estado.desbloquear());//La primera vez lo desbloquea, la segunda muestra el estado actual
        System.out.println(tel1.estado.desbloquear());//Hay que ejecutarlo de nuevo si queremos que muestre el último estado

        //Abrimos la cámara
        System.out.println("----------Abrir la Cámara----------------");
        System.out.println(tel1.estado.abrirCamara());//La primera vez abre la Camara, la segunda muestra el estado actual
        System.out.println(tel1.estado.abrirCamara());//Hay que ejecutarlo de nuevo si queremos que muestre el último estado

        System.out.println("----------Hacer foto---------------------");
        System.out.println(tel1.estado.hacerFoto());//La primera vez abre acciona la foto, la segunda muestra el estado actua
        System.out.println(tel1.estado.hacerFoto());//Hay que ejecutarlo de nuevo si queremos que muestre el último estado


        System.out.println("----------Estado después de la foto------"); //Hemos reseteado al estado inicial(Bloqueado)
        System.out.println(tel1.getEstado().toString());

    }
}
