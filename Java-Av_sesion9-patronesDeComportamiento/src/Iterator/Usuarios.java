package Iterator;

import java.util.ArrayList;

/**
 * Aquí implementamos el patrón. (Como nombre se suele usar el de la clase en plural)
 * Implementamos los métodos de la interfaz y otros métodos que necesitamos para el patron
 */
public class Usuarios implements UsuarioIterator{
    //Listas PRIVADAS de datos con el formato que mejor nos venga
    private ArrayList<Usuario> usuarios = new ArrayList<>(); //podemos cambiar el tipo de dato y seguiría funcionando
    //Índice PRIVADO
    private int posicion =0;

//Métodos crear y demás que necesitemos
    public void crear(Usuario usuario){
        usuarios.add(usuario);
    }

//-------------Métodos de la ineterfaz--------------------
    @Override
    public boolean hayMas() {
        return posicion < usuarios.size(); //if(posicionActual < usuarios.size()){ return true}else {return false}
    }

    @Override
    public void reinicia() {
        posicion = 0;
    }

    @Override
    public Usuario siguiente() {
        Usuario usuario = this.usuarios.get(posicion); //Obtenemos el usuario de la posición actual, lo guardamos en la variable temporal
        posicion++; //incremento la posición interna de la lista
        return usuario; //devolvemos el usuario de la variable temporal
    }
}
