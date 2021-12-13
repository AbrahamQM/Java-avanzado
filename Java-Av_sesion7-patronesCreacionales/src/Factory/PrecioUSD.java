package Factory;
/**
 * El patrón factory sirve para crear una jerarquía de clases
 * 2º diferentes clases que implementan la interfaz de maneras distintas.
 */
public class PrecioUSD implements Precio{

    //Implementamos las funciones de la interfaz Precio

    @Override
    public double getPrecio() {
        return 0.94;
    }
}
