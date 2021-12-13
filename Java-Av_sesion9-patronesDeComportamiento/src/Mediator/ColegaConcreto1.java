package Mediator;

public class ColegaConcreto1 extends Colega{

    //Implementamos los métodos

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto1");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto1, envío un mensaje...");
        mediator.reenvia(this); //Le decimos al mediador que envíe un mensaje emitido por mí (ColegaConcreto1)

    }
}
