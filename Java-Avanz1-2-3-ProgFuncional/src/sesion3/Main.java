package sesion3;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Suma Iterativa: " +suma (5));
        System.out.println("Suma Recursivaiva: " +sumaRecursiva (5));

        //llamamos a función recursiva de cola
        System.out.println("Llamamos a función recursiva de COLA tailRecursion:");
        tailRecursion(5);  //se iran mostrando los resultados del primero al último 5-4-3-2-1 (El valor inicial es 5)
        //llamamos a función recursiva por cabeza
        System.out.println("Llamamos a función recursiva de CABEZA headRecursion:");
        headRecursion(5); //se iran mostrando los resultados del último al primero 1-2-3-4-5 (El valor inicial es 5)

        //Llamamos a función creada con programación funcional
        System.out.println("Llamamos a función creada con programación funcional headRecursion, resultado:");
        System.out.println("Suma Funcional: " +sumaFuncional(5));
    }

    /**Función iterativa------------------------------**/
    public static int suma(int max){
        int resultado= 0;

        for (int i=0; i<= max; i++) {
            resultado += i;
        }
        return resultado;
    }

    /**función recursiva (por cola) ----------------------------------------------------
     *
     * @param numero
     * @return
     *
     * Hace lo siguiente:
     *  sumaRecursiva(5)->5
     *  sumaRecursiva(4)    ->5-1
     *  sumaRecursiva(3)        ->4-1
     *  sumaRecursiva(2)            ->3-1
     *  sumaRecursiva(1)                ->2-1
     *
     *                      mientras numero sea distinto a 1
     */
    public static int sumaRecursiva(int numero){
        if (numero ==1){  //esta sentencia se encarga de desmontar la pila del final al principio //sentencia de control
            return 1;
        }
        return numero + sumaRecursiva(numero -1);
    }



    /**-------------------------------------------------------------------------
     * otro ejemplo función recursiva por cola
     */
    public static void tailRecursion(int valor){
        if(valor==0){return;} //sentencia de control
        System.out.println(valor);  //Primero imprimimos
        tailRecursion(valor -1); //y luego ejecutamos la recursividad
        //se iran mostrando los resultados del primero al último 5-4-3-2-1 (El valor inicial es 5)
    }

    /**-----------------------------------------------------------------------
     * Ejemplo de función recursiva de cabeza
     */
    public static void headRecursion(int valor){
        if (valor == 0){return;} //sentencia de control
        headRecursion(valor -1); //primero Ejecutamos la recursividad
        System.out.println(valor); //y luego imprimimos
        //se iran mostrando los resultados del último al primero 1-2-3-4-5 (El valor inicial es 5)

    }

    /**----------------OJO---ESTA ES UNA FUNCIÓN creada con PROGRAMACIÓN FUNCIONAL--------------------
     *
     *
     */
    public static int sumaFuncional(int numero){
        return IntStream.rangeClosed(1,numero)
                .reduce(0, (a,b) -> a + b); //igual que en sesion2.Main.java Lin 74
        // Esta función .reduce(valor identity(le indicamos por cual comenzar), operación)
        //(a) tomará el valor actual de identity
        //(b) irá aumentando en cada iteración

    }


}
