package EjemploBasico;/*
2º Forma de cumplir con la O de SOLID: Clases abstractas (all el ejemplo en la misma clase para que se vea mejor)
 */

abstract class Ej2Vehiculo {
    String tipo;
    public String getTipoVehiculo() {
        return tipo;
    }
}

class Ej2Coche extends Ej2Vehiculo{
    public Ej2Coche(String tipo){
        tipo=tipo;
    }
}

class Ej2CocheElectrico extends Ej2Vehiculo{
    String baterias;

    public Ej2CocheElectrico(String tipo){
        this.tipo = tipo;
        this.baterias = "si";

    }

    public String getBaterias(){
        return this.baterias;
    }
}

