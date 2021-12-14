package Refactor;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Para probar  la refactorización de una función
//        int numeros[] = {12,23,-45,1,9};
//        imprimeMayorYMenor(numeros);

//Probamos refactorización de ConstructorLargo
    ConstructorLargo cosa = new ConstructorLargo("marca", "motor", "modelo", 5);
//Igual pero con un patron builder
    ConstructorLargoBuilder cosa2 = new ConstructorLargoBuilder("marca2")
            .conModelo("modelo2")
            .conMotor("motor2")
            .conPuertas(4);
    System.out.println(cosa.marca + " " +cosa.modelo + " "+cosa.motor + " "+cosa.puertas );
    System.out.println(cosa2.marca + " " +cosa2.modelo + " "+cosa2.motor + " "+cosa2.puertas );

    }

/**********************************************
 * Primera función (sin refactorizar)
 */
//    public static void imprimeMayorYMenor(int[] numeros){
//        int mayor=numeros[0];//le asignamos el primer valor del array
//        int menor=numeros[0];//le asignamos el primer valor del array
//
//        for (int i=0; i<numeros.length; i++){
//            if (mayor < numeros[i]){
//                mayor = numeros[i];
//            }
//            if (menor > numeros[i]){
//                menor = numeros[i];
//            }
//        }
//
//        System.out.println("El mayor es: " + mayor +" El menor es: " + menor);
//
//
//    }
/*************************************************
* 1º Refactor usando operador ternario
*/
//    public static void imprimeMayorYMenor(int[] numeros){
//        int mayor=numeros[0];//le asignamos el primer valor del array
//        int menor=numeros[0];//le asignamos el primer valor del array
//
//        for (int i=0; i<numeros.length; i++){
//            //********OPERADOR TERNARIO*************
//            //(si mayor es < numeros[i])  mayor=numeros[i] "modificamos mayor"
//            //(si mayor NO es < numeros[i]) mayor = mayor "se quedaría igual"
//            mayor = mayor<numeros[i] ? numeros[i] : mayor;
//            menor = menor>numeros[i] ? numeros[i] : menor; //igual pero con menor
//        }
//
//        System.out.println("El mayor es: " + mayor +" El menor es: " + menor);
//
//    }
/***************************************************
* 2º Refactorización
* simplificando el for y
* reduciendo aún más el uso del operador ternario
*/
//    public static void imprimeMayorYMenor(int[] numeros){
//        int mayor=numeros[0];//le asignamos el primer valor del array
//        int menor=numeros[0];//le asignamos el primer valor del array
//
//        for (int i : numeros){ //Usamos if mas corto, i va a tomar cada valor de numeros
//
//            mayor = mayor<i ? i : mayor; //si mayor< valor actual de i ->asignamos mayor se queda igual (mayor = mayor)
//            menor = menor>i ? i : menor;
//        }
//
//        System.out.println("El mayor es: " + mayor +" El menor es: " + menor);
//
//    }
/***************************************************************
* 3º Refactorización
* Programación funcional
*/
    public static void imprimeMayorYMenor(int[] numeros){
        int mayor = Arrays.stream(numeros) //Variable mayor = Arrays.stream(numeros)
                .reduce(0, (a, b) -> a > b ? a: b);
        //.reduce(ComienzaEnPosición i=0, (a=numeros[i], b=numeros[i+1]) -> if(a>b){ a = a;} if(!a>b){ a = b;}
        int menor = Arrays.stream(numeros).reduce(0, (a, b) -> a < b ? a: b);

//Stream (Devuelve un IntStream secuencial con la matriz especificada como origen.)
//reduce: Realiza una reducción en los elementos de esta secuencia, utilizando el valor de identidad proporcionado
// y una función de acumulación asociativa, y devuelve el valor reducido.
        System.out.println("El mayor es: " + mayor +" El menor es: " + menor);

    }
/**--------------------------------------------------------
 *  *Otro ejemplo de refactorización.
 *1º Uso de if inicial:
 */
//    public static int ifAfinado1() {
//        int valor1 = 10;
//        int valor2 = 20;
//        if (valor1 > valor2){
//            return valor1;
//        }else {
//            return valor2;
//        }
//    }
/**--------------------------------------------------------
 *  *Otro ejemplo de refactorización.
 *2º Eliminamos el else y hace exactamente lo mismo
 * La técnica se llama (Extraer el valor de retorno)
 */
    public static int ifAfinado1() {
        int valor1 = 10;
        int valor2 = 20;
        if (valor1 > valor2){
            return valor1;
        }
        return valor2;

    }



}
