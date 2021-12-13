package Adapter;

/**
 * Suponemos que esta clase no está adaptada a la interfaz.
 * Seria como si fuera un electrodoméstico que tiene un enchufe extranjero
 */
public class LightBulb {
    boolean poweredOn = false;
    int voltage = 0;

    //Encender
    public void turnOn(int voltage){
       poweredOn = true;
       this.voltage = voltage;
        System.out.println("Encendiendo Bombilla Inglesa, Voltage:"+ voltage);
    }

    //Apagar
    public void turnOff(int voltage){
        poweredOn = false;
        this.voltage = 0;
        System.out.println("Apagando Bombilla Inglesa, Voltage:"+ voltage);
    }

    //Estado Encendida?
    public boolean isPoweredOn(){
        return poweredOn;
    }
}
