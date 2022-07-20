package EjemploBasico;

public class AritmeticaMejoradaChivata extends Aritmetica{
    @Override
    int suma(int a, int b) {
        System.out.println("Estoy en suma");
        return a + b;
    }

    @Override
    int resta(int a, int b) {
        System.out.println("Estoy en resta");
        return a - b;
    }

    @Override
    int multiplicacion(int a, int b) {
        System.out.println("Estoy en multiplicación");
        return a * b;
    }

    @Override
    int division(int a, int b) {
        System.out.println("Estoy en división");
        return a / b;
    }
}
