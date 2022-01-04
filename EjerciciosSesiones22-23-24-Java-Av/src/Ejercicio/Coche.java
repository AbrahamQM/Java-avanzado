package Ejercicio;
//1ª Parte: Crea una clase coche aplicándole el principio de responsabilidad única (S).
public class Coche {
    String modelo;
    String marca;
    String matricula;
    int añoMatriculacion;

    //A continuación adaptación del código a principio de liskov
    boolean estaArrancado = false;

    public void arrancar() {}

    public int kmEstimados() {return 0;}

    public void apagar() {}
}
