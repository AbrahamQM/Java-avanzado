package EjConCódigoAnterior;
/*
En este ejemplo cogemos el paquete CódigoOriginal y lo modificamos aplicando el principio de Open-Closed,
lo que es lo mismo, la O de SOLID.

--Empezaremos trabajando con la clase UsuariosDB (Sin modificarla), ampliaremos sus funcionalidades con
UsuariosDBEstadisticas.

--Para que se ejecuten las funcionalidades de nuestra nueva clase hija,
utilizaremos la misma en lugar de la clase padre. Para ello modificamos el constructor inicial para que se cree
una instancia de la clase hija: Usuarios Lin: 12 y 13

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
        usuario2.nivelAcceso = 5;

        Usuario usuario3 = new Usuario();
        usuario3.nombreUsuario = "openbootcamp3";
        usuario3.nombre = "Open3";
        usuario3.apellidos = "Bootcamp3";
        usuario3.email = "ejemplos@open-bootcamp.com3";
        usuario3.nivelAcceso = 1;

        Usuarios usuarios = new Usuarios();
        usuarios.insertar(usuario);
        usuarios.insertar(usuario2);
        usuarios.insertar(usuario3);

        Usuario openbootcamp = usuarios.obtener("openbootcamp");
        System.out.println(openbootcamp.email);

//        usuarios.borrar("openbootcamp2");
//        usuarios.borrar("openbootcamp3");
        for (Usuario a : usuarios.listar()) {
            System.out.println("\n" + "-".repeat(a.nombreUsuario.length() + "nombre de usuario".length()));
            //repeat(numeroDeVeces) hace que se repita la cadena de caracteres tantas veces como le indiquemos
            System.out.println(a);
        }

        //Añadimos estas líneas para obtener los datos de UsuariosDBEstadisticas
        System.out.println("\nRegistro de cambios:");
        System.out.println("-Total inserciones: " + usuarios.usuariosDb.getTotalInserciones());
        System.out.println("-Total eliminaciones: " + usuarios.usuariosDb.getTotalEliminaciones());

/*Ahora imaginemos que queremos que los usuarios tengan un rango que les permita hacer distintas cosas según el mismo.
* Creamos una nueva clase llamada UsuariosNiveles
* */

        //Añadiremos estas líneas para comprobar el nivel usando UsuariosDBEstadisticas
        UsuariosNiveles usuariosNiveles = new UsuariosNiveles();

        System.out.println("\n-----Niveles de usuarios:");
        System.out.println( "-"+ usuario.nombreUsuario + " ¿Es administrador? "+ usuariosNiveles.esAdmnistradoor(usuario));
        System.out.println( "-"+ usuario2.nombreUsuario + " ¿Es administrador? "+ usuariosNiveles.esAdmnistradoor(usuario2));
        System.out.println( "-"+ usuario3.nombreUsuario + " ¿Es administrador? "+ usuariosNiveles.esAdmnistradoor(usuario3));
    }
}
