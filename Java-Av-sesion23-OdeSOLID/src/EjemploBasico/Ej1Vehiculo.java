package EjemploBasico;/*
Primera forma de cumplir la O de SOLID: Con Interfaces (all el ejemplo en la misma clase para que se vea mejor)
 */

public interface Ej1Vehiculo {

    String getTipoVehiculo();

}

class Coche implements Ej1Vehiculo{
    String tipo;

    public Coche(String tipo){this.tipo=tipo;}

    @Override
    public String getTipoVehiculo() {
        return tipo;
    }
}

class CocheElectrico implements Ej1Vehiculo{
    String tipo;
    String baterias;

    public String CocheElectrico(String tipo){
        return tipo=tipo;
    }

    @Override
    public String getTipoVehiculo() {
        return tipo;
    }

    public String getBaterias(){
        return this.baterias;
    }
}
