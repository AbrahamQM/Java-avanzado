package EjConCodigo.Inicial;
//1ºModificamos UsuariosDB para convertirla en interfaz
//2º Cambiamos la palabra extends (en las clases que extendían UsuariosDB)
// por implements para que cumpla con la interfaz en lugar de extender una clase
//3º Eliminar las llamadas a incrementarInserciones(); y incrementarEliminaciones(); que ahora no cumplen con la interfaz
//4º implementamos una nueva interfaz UsuariosDBEstadisticas para prototipar los métodos que acabamos de eliminar
//5º Hacemos que las clases que queremos que implementen esas funciones implementen UsuariosDBEstadisticas
//6º hacemos que esas clases que implementan UsuariosDBEstadisticas implementen los métodos @override

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

        UsuariosDB usuariosDB;

        String tipo = "memoria";
        if (tipo.equalsIgnoreCase("fichero")) {
            usuariosDB = new UsuariosDBFichero();
        } else {
            usuariosDB = new UsuariosDBMemoria();
        }

        Usuarios usuarios = new Usuarios(usuariosDB);

        usuarios.crearUsuario(usuario);
        usuarios.crearUsuario(usuario2);
        usuarios.crearUsuario(usuario3);

        Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp");
        System.out.println("Email del usuario obtenido: " + openbootcamp.email);

        usuarios.borrarUsuario("openbootcamp");
        //usuarios.borrarUsuario("openbootcamp3");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println("Usuario actual: " + a.nombreUsuario);
            System.out.println("----------------" + "-".repeat(a.nombreUsuario.length()));
            System.out.println(a);
            System.out.println();
        }

        System.out.println("Total de inserciones: " + usuariosDB.getTotalInserciones());
        System.out.println("Total de eliminaciones: " + usuariosDB.getTotalEliminaciones());
    }
}
