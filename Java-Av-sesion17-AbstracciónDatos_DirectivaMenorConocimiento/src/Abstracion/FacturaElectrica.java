package Abstracion;

public abstract class FacturaElectrica {
    double impuesto = 21;

    double obtenerImpuesto(double precio) { //Este método no lo vamos a abstraer porque va a ser
        return precio * impuesto /100;      //idéntico para las dos clases derivadas. (no duplicar código)
    }

//    public double calcularPrecioUsuario(){
//        return 0.55 + obtenerImpuesto(0.55);
//    }
//
//    public double calcularPrecioEmpresa(){
//        return 0.90 + obtenerImpuesto(0.90);
//    }
//  Ahora vamos a abstraer los métodos
//1º Hacer que la clase y los métodos sean abstract Lin:3,
//2º Creamos el método abstracto que sustituye esos dos métodos "comentados"

    abstract double calcularPrecio(); //no lleva cuerpo, es como en las interfaces

//3ª Tenemos que crear una clase que extienda esta clase e invocarla desde el main:
// FacturaElectricaUsuarios y FacturaElectricaEmpresas
// (No se puede invocar una clase abstracta directamente)




}
