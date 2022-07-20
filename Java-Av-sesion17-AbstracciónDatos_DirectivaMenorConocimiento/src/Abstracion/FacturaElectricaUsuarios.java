package Abstracion;

public class FacturaElectricaUsuarios extends FacturaElectrica{
    //debemos implementar los métodos de la clase abstracta FacturaElectrica

    @Override
    double calcularPrecio() {
        return 0.10 + obtenerImpuesto(0.10);
    }
}
