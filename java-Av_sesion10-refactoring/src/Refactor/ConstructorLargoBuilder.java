package Refactor;

public class ConstructorLargoBuilder {
    String marca;
    String motor;
    String modelo;
    int puertas;

    private ConstructorLargoBuilder(){} //Escondemos el constructor con private
    //Implementamos el patron  builder
    public ConstructorLargoBuilder (String marca){
        this.marca = marca;
    }//Este es el constructor ppal, por eso no tiene return this;

    public ConstructorLargoBuilder conMotor(String motor){
        this.motor = motor;
        return this;
    }

    public ConstructorLargoBuilder conModelo(String modelo){
        this.modelo = modelo;
        return this;
    }

    public ConstructorLargoBuilder conPuertas(int puertas){
        this.puertas= puertas;
        return this;
    }



}
