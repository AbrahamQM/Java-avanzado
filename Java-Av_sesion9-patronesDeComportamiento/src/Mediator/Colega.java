package Mediator;

public abstract class Colega {
    public Mediator mediator;

    public void setMediator(Mediator mediator){ //Creamos un setter
       this.mediator = mediator ;
    }
    //Funciones abstractas para que pueda enviar y recibir
    abstract void recibe();
    abstract void envia();


}
