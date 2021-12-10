package sesion2;

import java.util.function.Function;

    public class Funcionales {

    //Ejemplo de función de alto nivel
    //Ámbito Function<TipoDeParámetroQLePasamos, TipoDeParámetroQDevuelve> nombreDeFunción = nombreQLeDamosAlParámetro ...
    // Lambda(->) Implementación;

    //Ej :1
    private Function<String, String> toMayus = (x) -> x.toUpperCase(); //(x) es el nombre que tomará el parámetro que pasamos
    //Esta función hace lo mismo que Main.toMayuscula

    //Ej: 2
    private Function<Integer, Integer> sumador = (x) -> x.sum(x,x); //x.sum(x,x) suma el valor que hemos pasado, a si mismo


    public void pruebas(){
        //Uso de la función nombreFunción.apply(params);
        System.out.println(toMayus.apply("Abraham")); //Ej: 1
        System.out.println(sumador.apply(5));   //Ej: 2
        Saluda(toMayus, "Abraham"); //Ej: 3 función a la que le pasamos como param otra función
    }

    //Ej: 3 de una funcion a la que le pasamos otra función como parámetro
    public void Saluda(Function<String, String> miFuncion, String nombre){ //miFunción es el nombre que tendrá a nivel local
        System.out.println("Hola " + miFuncion.apply(nombre)  + " desde función saluda");
    }
}
