package Comentarios;


/**
 * Función Main que se va a encargar de realizar pruebas para la clase FindOdd().
 *
 * Puede mostrar en pantalla dos resultados:
 *
 * -Imprimirá, "true" cuando el resultado de la función es el esperado.
 * -Imprimirá, "false" cuando el resultado no se corresponda con el número esperado.
 *          (Lo que indicará que la lógica de la función está mal implementada).
 */

public class Main {
    public static void main(String[] args) {
        System.out.println((5==FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})));
        System.out.println((-1== FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})));
        System.out.println((5== FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5})));
        System.out.println((10== FindOdd.findIt(new int[]{10})));
        System.out.println((10== FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1})));
        System.out.println((1== FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10})));

    }
}

