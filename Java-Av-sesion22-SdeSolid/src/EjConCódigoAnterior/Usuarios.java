package EjConCódigoAnterior;
//Modificamos esta clase para quitarle los métodos que no le corresponden según la S de SOLID
//Eliminando todas las partes que se encargan de trabajar con el fichero

//principio de responsabilidad:
//--Gestionar usuarios, pero no sabe como o donde se guardan

import java.util.ArrayList;


public class Usuarios {

    private UsuariosDB usuariosDb = new UsuariosDB();


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
