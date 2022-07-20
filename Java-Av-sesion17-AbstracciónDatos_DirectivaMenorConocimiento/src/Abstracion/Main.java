package Abstracion;

public class Main {
    public static void main(String[] args) {
        FacturaElectrica fe = new FacturaElectricaEmpresas();
        System.out.println(fe.calcularPrecio());

        FacturaElectrica feu = new FacturaElectricaUsuarios();
        System.out.println(feu.calcularPrecio());

    }
}
