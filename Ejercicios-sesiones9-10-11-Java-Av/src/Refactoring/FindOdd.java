package Refactoring;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

//He pegado la clase FindOdd que hice para resolver la kata (sin refactorizar) al final de esta clase.
public class FindOdd {


    public static int findIt(int[] numeros) {
/*** Código refactorizado****/
        return stream(numeros).reduce(0, (x, y) -> x ^ y);
//PRIMERA REFACTORIZACIÓN
//        int puntero = 0;
//        int resultado =0;
//        for (int buffer : numeros) {
//            int contador = 1;
//            for (int i = 0; i < numeros.length; i++) {
//                if ((puntero == i) && (i < numeros.length - 1)) {
//                    i++;
//                }
//                if (numeros[i] == buffer) {
//                    resultado= buffer;
//                    contador++;
//                }
//            }
//            puntero++;
//            if (contador % 2 != 0) {
//                resultado = buffer;
//                break;
//            }
//
//        }

    }
}

/**
 * Código original
 */
//    public class FindOdd {
//        public static int findIt(int[] a) {
//            int buffer=0;
//            if(a.length == 1){
//                return a[0];
//            }else{
//                for (int i = 0; i < a.length; i++) {
//                    int contador = 1;
//                    buffer = a[i];
//                    for (int j = 0; j < a.length; j++) {
//                        if(( i == j)&& (j <a.length-1)){
//                            j++;
//                        }
//                        if (a[i] == a[j]) {
//                            contador++;
//                        }
//                    }
//                    if (contador % 2 != 0) {
//                        break;
//                    }
//                }
//
//            }
//            return buffer;
//        }
//    }