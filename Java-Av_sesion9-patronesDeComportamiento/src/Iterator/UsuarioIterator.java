package Iterator;

/**
 * * 1ºCreamos una interfaz con los siguientes métodos:
 *
 *     //Métodos mas comunes para el patron iterator
 *     next(); //devuelve el siguiente elemento de la lista
 *     reset(); //resetea el puntero para comenzar por el principio de la lista
 *     hasMore(); //nos dirá si hay más elementos en la lista por recorrer
 */

public interface UsuarioIterator {
    boolean hayMas();//Hay mas elementos en la lista?
    void reinicia(); //reinicia el contador(iterador)
    Usuario siguiente(); //obtiene el siguiente


}
