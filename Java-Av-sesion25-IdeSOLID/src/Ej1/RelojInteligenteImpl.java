package Ej1;

public class RelojInteligenteImpl implements Reloj, RelojInteligente{
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

/* Funciones extra que necesitaría esta clase no implementadas en interfaz Reloj  */
    public void enviarMensaje(){
   //codigo
    }

    public void obtenerCorreos(){
    //codigo
    }
}
