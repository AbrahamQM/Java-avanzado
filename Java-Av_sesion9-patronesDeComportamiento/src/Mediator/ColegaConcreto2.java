package Mediator;

public class ColegaConcreto2 extends Colega{

    //Implementamos los métodos

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto2");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto2, envío un mensaje...");
        mediator.reenvia(this);//Le decimos al mediador que envíe un mensaje emitido por mí (ColegaConcreto2)

    }
}

