package EjConCódigoAnterior;

public class UsuariosNiveles extends Usuarios {
    private Usuarios usuarios = new Usuarios();

    public boolean esAdmnistradoor(Usuario usuario){
        return comprobarNivel(usuario, 10);
    }

    public boolean esEstudiante(Usuario usuario){
        return comprobarNivel(usuario, 5);
    }

    public boolean esInvitado(Usuario usuario){
        return comprobarNivel(usuario, 1);
    }

    public boolean comprobarNivel(Usuario usuario, int nivel){
        if (usuarios.obtener(usuario.nombreUsuario) == null){
            return false;
        }
        if (usuario.nivelAcceso != nivel){
            return false;
        }
        return true;
    }

}
