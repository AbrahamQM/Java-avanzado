package Abstracion;

public class FacturaElectricaEmpresas extends FacturaElectrica{


    @Override
    double calcularPrecio() {
        return 0.90 + obtenerImpuesto(0.90);
    }
}
