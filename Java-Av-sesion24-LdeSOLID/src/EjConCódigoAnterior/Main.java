package EjConCódigoAnterior;

import java.util.Scanner;

/*
*Imaginemos que ahora queremos trabajar con usuarios en memoria en lugar de un fichero o DB
*-Para cumplir con el principio de Liskov, debemos implementar una nueva clase UsuariosDBMemoria
*que tenga los mismos métodos que hay en la clase que ya tenemos UsuarioDBMemoria.
*-También debemos crear una clase UsuariosDB para definir los prototipos.
*
*/
public class Main {
    public static void main(String []args) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 1;

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open2";
        usuario2.apellidos = "Bootcamp2";
        usuario2.email = "ejemplos2@open-bootcamp.com";
        usuario2.nivelAcceso = 2;

        Usuario usuario3 = new Usuario();
        usuario3.nombreUsuario = "openbootcamp3";
        usuario3.nombre = "Open3";
        usuario3.apellidos = "Bootcamp3";
        usuario3.email = "ejemplos3@open-bootcamp.com";
        usuario3.nivelAcceso = 3;

        /**Ahora podemos instanciar indistintamente las clases UsuariosDB, UsuariosDBFichero y UsuariosDBMemoria**/

//        Usuarios usuarios = new Usuarios(new UsuariosDBMemoria()); //Aquí podemos usar cualquiera de las 3 clases
//        //También podíamos instanciarla asi:
////      Usuarios usuarios = new Usuarios(new UsuariosDBFichero());
//        //O, así:
////      Usuarios usuarios = new Usuarios(new UsuariosDB());
////      "no hará nada porque en la clase padre no hemos implementado la lógica.
        /**Vamos a usar un método que cree un tipo de almacenamiento, según un parámetro int número**/
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 (Ficheros) - 2 (memoria) - otro (Vacío): ");
        int numero = scanner.nextInt();

        UsuariosDB usuariosDB;

        if (numero == 1){
            usuariosDB = new UsuariosDBFichero();
        }else if(numero == 2) {
            usuariosDB = new UsuariosDBMemoria();
        }else {
            usuariosDB = new UsuariosDB();
        }

        Usuarios usuarios = new Usuarios(usuariosDB);
        /**Fin de la implementation inicio en Lin:40**/

        usuarios.crear(usuario);
        usuarios.crear(usuario2);
        usuarios.crear(usuario3);

        Usuario openbootcamp = usuarios.obtener("openbootcamp");
        System.out.println("Email del usuario obtenido: " + openbootcamp.email);

        //usuarios.borrarUsuario("openbootcamp");
        //usuarios.borrarUsuario("openbootcamp3");
        System.out.println("\n----Listamos usuarios----\n");
        for (Usuario a : usuarios.listar()) {
            System.out.println("Usuario actual: " + a.nombreUsuario);
            System.out.println("----------------" + "-".repeat(a.nombreUsuario.length()));
            System.out.println(a);
            System.out.println();
        }
    }
}
