package Decorator;
/**
 * Aquí debemos heredar de nuestro decorador (TelefonoDecorator)
 *
 */
public class TelefonoNextGen extends TelefonoDecorator{
//Implementación del constructor
    public TelefonoNextGen(Telefono telefono) {//Igual que en la clase padre
        super(telefono);     //hacemos que este constructor "decorado" invoque a la clase padre,
        // usando el método "super" y, pasándole el parámetro que estamos recibiendo en el constructor.
    }

//Sobreescribimos el método crear de nuestraInterfaz
    @Override
    public void crear(){
        super.crear(); //Creamos un teléfono de la clase padre
        System.out.println("  -> NextGen Tengo también 5G");
        System.out.println("  -> NextGen Tengo también VolteEn");
    }

}


