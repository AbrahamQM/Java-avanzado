package EjConCódigoAnterior;

import java.util.ArrayList;
/*
--Para que se ejecuten las funcionalidades de nuestra nueva clase hija,
utilizaremos la misma en lugar de la clase padre. Para ello modificamos el constructor inicial para que se cree
una instancia de la clase hija. Lin 12 y 13
*/

public class Usuarios {

//    private UsuariosDB usuariosDb = new UsuariosDB();
    UsuariosDBEstadisticas usuariosDb = new UsuariosDBEstadisticas();

    public ArrayList<Usuario> listar() {
        return usuariosDb.convertirUsuariosFicheroEnArrayList();
    }

    public Usuario obtener(String username) {
        ArrayList<Usuario> usuarios = usuariosDb.convertirUsuariosFicheroEnArrayList();

        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(username)) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void insertar(Usuario usuario) {
        if (obtener(usuario.nombreUsuario) != null) {
            return;
        }
        //La parte de guardarlo en memoria está implementada en UsuariosDB
        usuariosDb.insertar(usuario);
    }

     public void borrar(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        usuariosDb.borrar(usuario);
    }
}
