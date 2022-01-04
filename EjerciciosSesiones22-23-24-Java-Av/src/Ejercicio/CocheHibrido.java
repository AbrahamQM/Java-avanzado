package Ejercicio;

public class CocheHibrido extends CocheMejorado{
    int consumoEl;
    int cargaActual;
    String tipoCombustible;
    int litrosEnDeposito;
    int consumoCombustible;


    private CocheHibrido(){}

    public CocheHibrido(int consumoEl, int cargaActual, String tipoCombustible, int litrosEnDeposito, int consumoCombustible) {
        this.consumoEl = consumoEl;
        this.cargaActual = cargaActual;
        this.tipoCombustible = tipoCombustible;
        this.litrosEnDeposito = litrosEnDeposito;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public void arrancar() {
        if (!estaArrancado){
            System.out.println("Arrancando Coche Híbrido");
            estaArrancado = true;
        }else{
            System.out.println("El coche híbrido ya estaba arrancado");
        }
    }

    @Override
    public void apagar() {
        if (!estaArrancado){
            System.out.println("El coche híbrido ya estaba apagado.");
        }else{
            System.out.println("Apagando coche híbrido");
            estaArrancado = false;
        }
    }

    @Override
    public int kmEstimados() {
        return ((cargaActual / consumoEl) + (litrosEnDeposito / consumoCombustible)) * 100;
    }


}
