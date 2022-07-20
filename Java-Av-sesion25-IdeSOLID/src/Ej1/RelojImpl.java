package Ej1;

public class RelojImpl implements Reloj{
    @Override
    public String horaActual() {
        return "10";
    }

    @Override
    public String minutoActual() {
        return "08";
    }

    @Override
    public String segundoActual() {
        return "45";
    }

/* Funciones extra que no necesitaría esta clase salvo para completar la implementación de la interfaz Reloj
las comento para hacerlo correctamente creando una nueva interfaz
 */
    public void enviarMensaje(){
        //codigo
    }

    public void obtenerCorreos(){
        //codigo
    }

}
