package Adapter;

/**
 * Para que podamos usar el patrón adaptador, y su interfaz (Enchufable)
 * las diferentes clases que lo necesiten, deberán implementar la interfaz
 */
public class Horno implements Enchufable{
    boolean encendido = false;

    @Override
    public void enciende() {
        encendido=true;
        System.out.println("Encendiendo Horno");
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Apagando Horno");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
