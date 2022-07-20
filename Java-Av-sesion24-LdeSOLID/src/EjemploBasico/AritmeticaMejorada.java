package EjemploBasico;

public class AritmeticaMejorada extends Aritmetica{
//    public int resta(int a, int b){
//        return a - b;
//    }
//
//    public int division(int a, int b){
//        return a / b;
//    }

/*Modificamos la clase para que implemente los métodos de la clase abstracta*/

    @Override
    int suma(int a, int b) {
        return a + b;
    }

    @Override
    int resta(int a, int b) {
        return a - b;
    }

    @Override
    int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    int division(int a, int b) {
        return a / b;
    }
/*Ahora imaginamos que queremos mejorar esta clase creando AritmeticaMejoradaChivata*/

}
