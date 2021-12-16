package Refactoring;

/**Enunciado:
 * Aplica refactoring a cualquiera de los proyectos que se han ido tratando en el curso, recuerda hacerte valer de las
 * técnicas vistas en clase incluidos los patrones de diseño.
 */
//No se a que proyectos se refiere el enunciado. Voy a usar una kata de Codewars para hacer el refactoring
//Consiste en una clase FindOdd que debe devolver en cada caso:
//Cuál de los números de cada Array que le pasamos se repite un número impar de veces
//Incluyendo el caso de: si el array tiene un sólo nº -> devolver ese nº.
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

