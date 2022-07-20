package EjConCódigoAnterior;

import java.util.ArrayList;

public class Usuarios {
//    UsuariosDBFichero usuariosDB = new UsuariosDBFichero(); ELIMINAMOS ESTA LÍNEA PARA SUSTITUIRLA POR:
    UsuariosDB usuariosDB;

//  También creamos un constructor que nos permita abstracción, siendo en el main (Lin: )donde vamos a definir que tipo
//  de almacenamiento de usuario vamos a usar.
    public Usuarios(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
    }

    public ArrayList<Usuario> listar() {
        return usuariosDB.obtener();
    }

    public Usuario obtener(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        return usuariosDB.buscar(usuario);
    }

    public void crear(Usuario usuario) {
        if (usuariosDB.buscar(usuario) != null) {
            return;
        }

        usuariosDB.insertar(usuario);
    }

    public void borrarUsuario(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        usuariosDB.borrar(usuario);
    }
}
