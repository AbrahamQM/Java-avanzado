package Ejercicio;

public class CocheElectrico extends CocheMejorado{
    int consumo;
    int cargaActual;

    private CocheElectrico(){}

    public CocheElectrico(int consumo, int cargaActual) {
        this.consumo = consumo;
        this.cargaActual = cargaActual;
    }

    @Override
    public void arrancar() {
        if (!estaArrancado){
            System.out.println("Arrancando Coche eléctrico");
            estaArrancado = true;
        }else{
            System.out.println("El coche eléctrico ya estaba arrancado");
        }
    }

    @Override
    public void apagar() {
        if (!estaArrancado){
            System.out.println("El coche eléctrico ya estaba apagado.");
        }else{
            System.out.println("Apagando coche eléctrico");
            estaArrancado = false;
        }
    }

    @Override
    public int kmEstimados() {
        return (cargaActual / consumo) * 100;
    }


}
