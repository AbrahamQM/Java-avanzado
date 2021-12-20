package FuncionesLimpias;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros ={ 9, 25 ,-98, 260, -578, 0, 25, 7, 144};
        System.out.println("El número mayor es: " + findBigger(numeros));
        System.out.println("Imprimir sólo los nº pares:");
        printPairs(numeros);

    }

    /**int findBigger(int[] numbers)
     * Método que determinará cuál de los elementos del array es el mayor.
     * @param numeros Array de tipo int con los números con los que trabajaremos.
     * @return devuelve un valor de tipo int, el número mayor de los que conforman el array que le pasamos.
     */
    public static int findBigger(int[] numeros) {

        return Arrays.stream(numeros).reduce(0, (a, b) -> (a > b) ? a:b);

    }

    /**void printPairs(int[] numeros)
     * Método que recorre el array de números comprobando uno por uno si se trata de un número par.
     * Si es un número par, lo muestra en una nueva línea. En caso contrario no hace nada.
     *
     * @param numeros Array de tipo int con los números con los que trabajaremos.
     */
    public static void printPairs(int[] numeros){
        //TODO: Intentar reducir la función usando programación funcional.
        for (int numero: numeros){
            if(numero %2 ==0){
                System.out.println(numero);
            }
        }
    }
}
