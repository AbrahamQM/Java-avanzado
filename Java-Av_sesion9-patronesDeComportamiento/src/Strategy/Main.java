package Strategy;

import java.util.ArrayList;

/**PATRON STRATEGY
 * Se usa para crear un envoltorio sobre varias funciones, de forma que, un mismo código se pueda utilizar de
 * diferentes maneras.
 * Similar a un método de pago (paypal, visa, Gpay, ApplePay)
 * Tendrán los mísmos métodos, pero cada uno cobrará de diferente manera
 */
public class Main {
    public static void main(String[] args) {

//        UsuariosMemoria usuariosMem = new UsuariosMemoria(); // Instanciamos nuestro objeto UsuariosMemoria
//        UsuariosFichero usuariosTXT = new UsuariosFichero();
//
//        System.out.println("AÑADIMOS USUARIOS A NUESTRA LISTA de UsuariosMemoria");
//        usuariosMem.crear("Abraham");
//        usuariosMem.crear("Ana");
//        usuariosMem.crear("Pepe");
//        System.out.println("AÑADIMOS USUARIOS A NUESTRO FICHERO de UsuariosFichero(usuarios.txt)");
//        usuariosTXT.crear("Jose ");
//        usuariosTXT.crear("Luis");
//        usuariosTXT.crear("María");
//
//        //LISTAMOS LOS USUARIOS de UsuariosMemoria
//        System.out.println("\nListado de Usuarios en MEMORIA");
//        for(String usuario: usuariosMem.listar() ){
//            System.out.println(usuario);
//        }
//
//        //LISTAMOS LOS USUARIOS de UsuariosFichero
//        System.out.println("\nListado de Usuarios en usuarios.txt:");
//        for(String usuario: usuariosTXT.listar() ){
//            System.out.println(usuario);
//        }
/**
 * HASTA LLEGAR AQUÍ, Hemos creado 2 clases (UsuariosMemoria)y(UsuariosFichero) que hacen lo mismo pero de formas
 * diferentes.
 * Es ahora cuando viendo que tienen los mismos métodos, implementamos el patrón STRATEGY creando una interfaz(Usuarios)
 * que definirá las funciones que ye tienen implementadas las clases (UsuariosMemoria)y(UsuariosFichero)
 * Y------1º Modificamos las clases para que implementen esa interfaz(Usuarios)
 * -------2º Ponemos la anotación @Override a las funciones que implementan
 * -------3º Creamos el envoltorio(Lin71)
 *
 * Ahora podríamos crear una variable para determinar donde queremos guardar los usuarios USANDO LA FUNCION selector(tipo);
 */
        int tipo = 0; //Cambiando la variable a 0 ó cualquier otro número definiremos el método que usaremos para
        // almecenar los usuarios
        Usuarios usuarios = selector(tipo) ;//(esta función no la usó VROMAN en la sesión)

        System.out.println("\n\n Comenzamos a usar el patron Strategy:");
        System.out.println("AÑADIMOS USUARIOS A NUESTRA LISTA ***usando el patron***" );

        crear(usuarios, "Lucas");
        crear(usuarios, "Alberto");
        crear(usuarios, "Lucia");


        //LISTAMOS LOS USUARIOS
        System.out.println("\nListado de Usuarios *****Usando el patrón*****");
        for(String usuario: usuarios.listar() ){
            System.out.println(usuario);
        }


    }
    //Envoltorio(wrapper) para usar la interfaz
    public static void crear(Usuarios usuarios, String nombre){  //Envoltorio para la funcion crear
        usuarios.crear(nombre);
    }
    public static ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }


    //Función que crea un tipo de usuario u otro según la variable tipo (esta función no la usó VROMAN en la sesión)
    public static Usuarios selector(int tipo){
        UsuariosMemoria usuariosMem = new UsuariosMemoria();
        UsuariosFichero usuariosTXT = new UsuariosFichero();
        if (tipo ==0){
            return usuariosMem;
        }else{
            return usuariosTXT;
        }

    }
}
