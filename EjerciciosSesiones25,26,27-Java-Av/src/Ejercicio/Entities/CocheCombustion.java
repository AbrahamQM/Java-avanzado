package Ejercicio.Entities;

import Ejercicio.EntitiesInterfaces.CocheMejorado;
import Ejercicio.EntitiesInterfaces.CochesCompletos;

public class CocheCombustion implements CocheMejorado, CochesCompletos {
    String tipoCombustible;
    int consumo;
    int litrosEnDeposito;
    public Coche coche= new Coche().setTipo("combustión");

    public CocheCombustion() {}

    @Override
    public void arrancar() {
        if (!coche.getEstaArrancado()){
            System.out.println("Arrancando Coche de combustion");
            coche.setEstaArrancado(true);
        }else{
            System.out.println("El coche de combustión ya estaba arrancado");
        }
    }

    @Override
    public void apagar() {
        if (!coche.getEstaArrancado()){
            System.out.println("El coche de combustion ya estaba apagado.");
        }else{
            System.out.println("Apagando coche de combustión");
            coche.setEstaArrancado(false);
        }
    }

    @Override
    public int kmEstimados() {
        return (litrosEnDeposito / consumo) * 100;
    }

    @Override
    public Coche getCoche() {
        return coche;
    }

    public CocheCombustion setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
        return this;
    }

    public CocheCombustion setConsumo(int consumo) {
        this.consumo = consumo;
        return this;
    }

    public CocheCombustion setLitrosEnDeposito(int litrosEnDeposito) {
        this.litrosEnDeposito = litrosEnDeposito;
        return this;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getLitrosEnDeposito() {
        return litrosEnDeposito;
    }
}

