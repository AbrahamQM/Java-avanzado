package Strategy;

import java.util.ArrayList;

/**
 * En esta clase vamos a trabajar con un ArrayList<String>, que contendrá los usuarios
 */

public class UsuariosMemoria implements Usuarios{
    private ArrayList<String> usuarios = new ArrayList(); //Lista de usuarios


    @Override
    public void crear(String nombre){ //método que añade un usuario
        usuarios.add(nombre);
        System.out.println("UsuariosMemoria--Añadiendo usuario: "+ nombre);
    }

    @Override
    public ArrayList<String> listar(){ //método que nos va a devolver el ArrayList de los usuarios.
        return usuarios;
    }
}
