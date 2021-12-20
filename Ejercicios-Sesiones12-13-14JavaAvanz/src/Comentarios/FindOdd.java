package Comentarios;


import static java.util.Arrays.stream;

/**
 * Esta clase "FindOdd" contiene un método "findIt", que implementará la lógica requerida en el ejercicio.
 * Corresponde a una kata de Codewars: https://www.codewars.com/
 */
public class FindOdd {

    /**
     * Método findIt encargado de encontrar el número que se repite una cantidad impar de veces.
     * @param numeros Array de tipo int en el que irán incluidos los números con los que trabajaremos.
     * @return Valor del tipo (int) (el número que se repite una cantidad impar de veces en el array).
     * @since 10/12/21
     */
    public static int findIt(int[] numeros) {
        /* Código final refactorizado */
        //El método convierte a stream el array que le pasemos y lo reduce a un único valor
        //usando la lógica XOR.
        return stream(numeros).reduce(0, (x, y) -> x ^ y);
    }
}

/*Código en una primera refactorización:
//Todo: Simplificar el código utilizando programación funcional.

        int puntero = 0;
        int resultado =0;
        for (int buffer : numeros) {
            int contador = 1;
            for (int i = 0; i < numeros.length; i++) {
                if ((puntero == i) && (i < numeros.length - 1)) {
                    i++;
                }
                if (numeros[i] == buffer) {
                    resultado= buffer;
                    contador++;
                }
            }
            puntero++;
            if (contador % 2 != 0) {
                resultado = buffer;
                break;
            }

        }
*/

/*
 * Código inicial que resuelve el ejercicio
 //TODO: Intentar simplificar y limpiar el código al máximo
 *
    public class FindOdd {
        public static int findIt(int[] a) {
            int buffer=0;
            if(a.length == 1){
                return a[0];
            }else{
                for (int i = 0; i < a.length; i++) {
                    int contador = 1;
                    buffer = a[i];
                    for (int j = 0; j < a.length; j++) {
                        if(( i == j)&& (j <a.length-1)){
                            j++;
                        }
                        if (a[i] == a[j]) {
                            contador++;
                        }
                    }
                    if (contador % 2 != 0) {
                        break;
                    }
                }

            }
            return buffer;
        }
    }*/