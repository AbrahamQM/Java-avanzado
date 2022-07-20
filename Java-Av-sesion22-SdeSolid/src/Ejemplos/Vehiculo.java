package Ejemplos;//Ejemplo 1 de responsabilidad única

public class Vehiculo {
    private int velocidad;

    public void acelerar(){
        velocidad ++;
    }

    public void frenar(){
        velocidad--;
    }

    public int getVelocidad(){
        return velocidad;
    }

    //Aquí se rompe el principio de responsabilidad única
    public void echarGasolina(){}
    //Para evitar romper el principio, tenemos que crear una clase diferenciada que se encargue del método echarGasolina

}


