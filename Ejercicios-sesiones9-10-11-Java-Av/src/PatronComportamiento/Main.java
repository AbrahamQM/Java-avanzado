package PatronComportamiento;

/**ENUNCIADO:
 * Aplica a uno de los proyectos anteriores un patrón de comportamiento de los vistos durante la sesión 9 y
 * explica por qué has escogido ese patrón en concreto.
 */

//No tengo muy claro a que proyectos se refieren con (uno de los proyectos anteriores) así que voy a implementar
//El patrón Observer en una función que notificará a todos los usuarios de una app que hay una nueva actualización disponible
//Habrá usuarios con dispositivos Android, IOs y Windows

/**Explicación de por qué he elegido este patrón:
 * El patrón observador es ideal para implementar un software de tipo (one to many).
 * Este parón resuelve el problema de como hacer que un elemento "central" pueda comunicar
 * algo a todos los elementos que de él dependen
 * */
public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador(); //instanciamos el notificador
        //Creamos 1 receptor de cada tipo de dispositivo para comprobar que funcionan
        AppIOs ios = new AppIOs();
        AppWindows windows = new AppWindows();
        AppAndroid android = new AppAndroid();
        //Conectamos el notificador con los receptores
        notificador.meteUsuario(ios);
        notificador.meteUsuario(windows);
        notificador.meteUsuario(android);

        System.out.println("------------1º actualización de la app.-----------");
        notificador.notifica(1);

        System.out.println("------------2º actualización de la app.-----------");
        notificador.notifica(2);

    }
}
