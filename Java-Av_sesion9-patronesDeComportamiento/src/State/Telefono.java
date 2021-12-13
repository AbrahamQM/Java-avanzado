package State;

public class Telefono {
    public Estado estado;

    public Telefono(){
        estado = new EstadoBloqueado(this); //Al crear el teléfono, tendrá el estadoBloqueado
    }

    public void cambiaEstado(Estado estado){ //método que cambia el estado
        System.out.println("Estado inicial: " + this.estado.getClass().getName());
        this.estado = estado; //Actualizamos el estado
        System.out.println("Estado final: " + this.estado.getClass().getName());
    }

    public Estado getEstado(){ //método que nos da el estado actual
        return estado;
    }
}
