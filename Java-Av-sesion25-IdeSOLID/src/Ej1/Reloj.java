package Ej1;

public interface Reloj {
    String horaActual();
    String minutoActual();
    String segundoActual();

/* Funciones extra que no necesitaría esta interfaz salvo para que RelojInteligenteImpl pueda implementar esta
*interfaz Reloj.
*las comento para hacerlo correctamente creando una nueva interfaz
 */
//    void enviarMensaje();
//    void obtenerCorreos();
}
