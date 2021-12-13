package Adapter;

/**
 * Esta es la interfaz que implementarán los clases que no necesitan adaptación
 */
public interface Enchufable {
    void enciende();
    void apaga();
    boolean estaEncendido();
}
