package Ejercicio;
//2ª parte: Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin modificarlo aplicando
//el principio abierto/cerrado(O).
public class CocheMejorado extends Coche{
    //A continuación adaptación del código a principio de liskov
//    boolean estaArrancado = false;

    public void arrancar(){};
    public void apagar(){};
    public int kmEstimados(){return 0;};
}
