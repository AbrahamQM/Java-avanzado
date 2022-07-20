package EjemploBasico;

//public class Aritmetica {  ****LA CONVERTIMOS EN ABSTRACTA: Main Lin:21 1º MODIFICACIÓN:
abstract class Aritmetica{


//    public int suma(int a, int b){
//        return a + b;
//
//    }
//
//    public int multiplicacion(int a, int b){
//        return a * b;
//    }

/*Hacemos que la clase tenga la definición de los métodos, pero no la implementación*/

    abstract int suma(int a, int b);
    abstract int resta(int a, int b);
    abstract int multiplicacion(int a, int b);
    abstract int division(int a, int b);

/*Seguiría sin cumplir el principio de Liskov, ya que no se puede instanciar a la clase padre Aritmética por
ser abstracta, para resolverlo, deberíamos quitar la palabra abstract(en la clase y los métodos
y darle cuerpo a los métodos */
}
