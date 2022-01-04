package Ejercicio;

public class CocheCombustion extends CocheMejorado {
    String tipoCombustible;
    int consumo;
    int litrosEnDeposito;

    private CocheCombustion() {}

    public CocheCombustion(String tipoCombustible, int consumo, int litrosEnDeposito) {
        this.tipoCombustible = tipoCombustible;
        this.consumo = consumo;
        this.litrosEnDeposito = litrosEnDeposito;
    }

    @Override
    public void arrancar() {
        if (!estaArrancado){
            System.out.println("Arrancando Coche de combustion");
            estaArrancado = true;
        }else{
            System.out.println("El coche de combustión ya estaba arrancado");
        }
    }

    @Override
    public void apagar() {
        if (!estaArrancado){
            System.out.println("El coche de combustion ya estaba apagado.");
        }else{
            System.out.println("Apagando coche de combustión");
            estaArrancado = false;
        }
    }

    @Override
    public int kmEstimados() {
        return (litrosEnDeposito / consumo) * 100;
    }


}

