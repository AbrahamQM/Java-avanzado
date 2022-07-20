package ExcepcionNullPointerException;

import java.util.ArrayList;

public class Usuarios {
    public Usuario[] getUsuarios;
    ArrayList<Usuario> usuarios = new ArrayList<>();


    public Usuarios(Usuario usuario){
        usuarios.add(usuario);
    }
    private void Usuario(){}
    public Usuarios() {}

    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
}
