package Decorator;

/**
 * Esta es la clase que implementa el patrón DECORADOR o decorator
 */
public class TelefonoDecorator implements Telefono{ //Debe implementar nuestraInterfaz
    private Telefono telefono; //Declaramos una variable/atributo de tipo nuestraInterfaz

//Implementamos los métodos de la interfaz:
    @Override
    public void crear() {
        this.telefono.crear(); //Invocamos al método crear de nuestra variable/atributo de tipo nuestraInterfaz
    }

//Creamos un constructor cuyo parámetro va a ser una clase que implemente nuestraInterfaz
    public TelefonoDecorator(Telefono telefono){
        this.telefono = telefono;
    }
//Implementamos los decoradores en nuevas clases (En este caso TelefonoInteligente.java y TelefonoNextGen)
}
