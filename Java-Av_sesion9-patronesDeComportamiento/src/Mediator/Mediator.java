package Mediator;

public abstract class Mediator {
    abstract void registra(Colega colega); //Va a registrar a los elementos externos (aviones en el caso del controlador aéreo)
    abstract void reenvia(Colega colega); //_Recibirá el mensaje para pasárselo(reenviarlo) a quien corresponda

}
