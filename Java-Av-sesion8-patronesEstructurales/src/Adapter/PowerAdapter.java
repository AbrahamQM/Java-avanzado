package Adapter;

/**
 * Esta clase se va a encargar de adaptar LightBulb (que no implementa la interface) para que pueda funcionar como todos
 * los demás electrodomésticos.
 * -----Si tuviéramos más clases que no implementan la interfáz, había que crear un adaptador para cada una, salvo que
 * todas esas clases funcionen de la misma manera que la que vamos a adaptar aquí.------
 * 1º Instancia/s la clase/s que queremos adaptar
 * 2º Adaptamos los métodos que implementan la interfaz, específicamente para esa clase que no la implementaba
 */
public class PowerAdapter implements Enchufable{
    //1º
    public LightBulb bombillaInglesa= new LightBulb();


//Sobreescribimos los métodos como siempre.
    @Override
    public void enciende() {
        //2º
        bombillaInglesa.turnOn(110);
    }

    @Override
    public void apaga() {
        //2º
        bombillaInglesa.turnOff(0);
    }

    @Override
    public boolean estaEncendido() {
        //2º
        return bombillaInglesa.isPoweredOn();
    }
}
