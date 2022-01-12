package Ejercicio.Entities;

import Ejercicio.EntitiesInterfaces.CocheMejorado;
import Ejercicio.EntitiesInterfaces.CochesCompletos;

public class CocheHibrido implements CocheMejorado, CochesCompletos {
    int consumoEl;
    int cargaActual;
    String tipoCombustible;
    int litrosEnDeposito;
    int consumoCombustible;
    public Coche coche= new Coche().setTipo("híbrido");

    public CocheHibrido(){}

    @Override
    public void arrancar() {
        if (!coche.getEstaArrancado()){
            System.out.println("Arrancando Coche Híbrido");
            coche.setEstaArrancado(true);
        }else{
            System.out.println("El coche híbrido ya estaba arrancado");
        }
    }

    @Override
    public void apagar() {
        if (!coche.getEstaArrancado()){
            System.out.println("El coche híbrido ya estaba apagado.");
        }else{
            System.out.println("Apagando coche híbrido");
            coche.setEstaArrancado(false);
        }
    }

    @Override
    public int kmEstimados() {
        return ((cargaActual / consumoEl) + (litrosEnDeposito / consumoCombustible)) * 100;
    }

    @Override
    public Coche getCoche() {
        return coche;
    }


    public CocheHibrido setConsumoEl(int consumoEl) {
        this.consumoEl = consumoEl;
        return this;
    }

    public CocheHibrido setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
        return this;
    }

    public CocheHibrido setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
        return this;
    }

    public CocheHibrido setLitrosEnDeposito(int litrosEnDeposito) {
        this.litrosEnDeposito = litrosEnDeposito;
        return this;
    }

    public CocheHibrido setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
        return this;
    }

    public int getConsumoEl() {
        return consumoEl;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getLitrosEnDeposito() {
        return litrosEnDeposito;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }
}
