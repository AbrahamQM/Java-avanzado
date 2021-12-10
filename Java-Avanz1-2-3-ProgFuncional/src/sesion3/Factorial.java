package sesion3;

import java.util.stream.IntStream;

/**
 * Ejemplo de tipos de funciones similares a las de Main.java
 * vamos a sacar el factorial de un número de diferentes formas:
 *
 * FACTORIAL: hay que multiplicar todos los números enteros positivos que hay entre ese número y el número 1
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Función factorial Iterativa: " + factorial(5));
        System.out.println("Función factorial Recursiva: " + factorialRecursivo(5));
        System.out.println("Función factorial Funcional: " + factorialFuncional(5));
    }

    //Función iterativa
    public static int factorial(int numero){
        int resultado=1;
        for (int i = 1; i<= numero; i++){
            resultado *=i;
        }
        return resultado;
    }

    //Función Recursiva
    public static int factorialRecursivo(int numero){
        if(numero == 0){return 1;} //sentencia de control
        return numero * factorialRecursivo(numero -1);
    }

    //Función en versión funcional
    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1, numero)
                .reduce(1, (a,b) -> a*b); // comprobar función reduce
    }
}
