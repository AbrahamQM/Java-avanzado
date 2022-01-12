package Ejercicio.Entities;

import Ejercicio.EntitiesInterfaces.CocheMejorado;
import Ejercicio.EntitiesInterfaces.CochesCompletos;

public class CocheElectrico implements CocheMejorado, CochesCompletos {
    int consumo;
    int cargaActual;
    public Coche coche= new Coche().setTipo("eléctrico");

    public CocheElectrico(){}

    @Override
    public void arrancar() {
        if (!coche.getEstaArrancado()){
            System.out.println("Arrancando Coche eléctrico");
            coche.setEstaArrancado(true);
        }else{
            System.out.println("El coche eléctrico ya estaba arrancado");
        }
    }

    @Override
    public void apagar() {
        if (!coche.getEstaArrancado()){
            System.out.println("El coche eléctrico ya estaba apagado.");
        }else{
            System.out.println("Apagando coche eléctrico");
            coche.setEstaArrancado(false);
        }
    }

    @Override
    public int kmEstimados() {
        return (cargaActual / consumo) * 100;
    }

    @Override
    public Coche getCoche() {
        return coche;
    }


    public CocheElectrico setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
        return this;
    }

    public CocheElectrico setConsumo(int consumo) {
        this.consumo = consumo;
        return this;
    }

    public CocheElectrico setEstaArrancado(boolean estaArrancado) {
        this.coche.setEstaArrancado(estaArrancado);
        return this;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getCargaActual() {
        return cargaActual;
    }
}
