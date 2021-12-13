package Builder;

public class CocheBuilder {
//Atributos
    Vehiculo vehiculo;

//Métodos ESPECIALES de tipo fluido o programación funcional

    public CocheBuilder(){//***Prueba creando un vehículo sin indicarle la marca en el constructor ****HECHO POR MI****
        vehiculo = new Vehiculo(); //**********POLIMORFISMO***********
    }//****************************************************************************************************************


    public  CocheBuilder(String marca){ //Constructor con parámetro marca "Según explicación de VictorRoman
        vehiculo = new Vehiculo();
        vehiculo.marca =marca;

    }
    public CocheBuilder setMarca(String marca){
        vehiculo.marca = marca;
        return this;
    }

    public CocheBuilder setPuertas(int puertas){
        vehiculo.puertas = puertas;
        return this;
    }
    public CocheBuilder setTipo(String tipo){
        vehiculo.tipo = tipo;
        return this;
    }

    public CocheBuilder setMotor(String motor){
        vehiculo.motor= motor;
        return this;
    }

    //Este método (build) siempre se implementa con los patrones builder
    //Debe devolver this.objeto que creamos al principio de la clase
    public Vehiculo build(){
        return this.vehiculo;
    }

}
