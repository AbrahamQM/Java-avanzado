package EjConCódigoAnterior;
/*
En este ejemplo cogemos el paquete CódigoOriginal y lo modificamos aplicando el principio de responsabilidad
única o, lo que es lo mismo, la S de SOLID
 */
public class Main {
    public static void main(String []args) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 10;



        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open2";
        usuario2.apellidos = "Bootcamp2";
        usuario2.email = "ejemplos@open-bootcamp.com2";
        usuario2.nivelAcceso = 20;

        Usuario usuario3 = new Usuario();
        usuario3.nombreUsuario = "openbootcamp3";
        usuario3.nombre = "Open3";
        usuario3.apellidos = "Bootcamp3";
        usuario3.email = "ejemplos@open-bootcamp.com3";
        usuario3.nivelAcceso = 30;

        Usuarios usuarios = new Usuarios();
        usuarios.insertar(usuario);
        usuarios.insertar(usuario2);
        usuarios.insertar(usuario3);

//        Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
//        System.out.println(openbootcamp.email);
//
        usuarios.borrar("openbootcamp2");
        for (Usuario a : usuarios.listar()) {
            System.out.println("\n" + "-".repeat(a.nombreUsuario.length() + "nombre de usuario".length()));
            //repeat(numeroDeVeces) hace que se repita la cadena de caracteres tantas veces como le indiquemos
            System.out.println(a);
        }
    }
}
