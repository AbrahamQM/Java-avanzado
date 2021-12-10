package sesion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//Hemos puesto este ejemplo en otra clase, para que se vea más claro
        System.out.println("-----------------Ejemplos en la clase Funcionales.java----------------");
        Funcionales f = new Funcionales(); //Creamos objeto de la clase
        f.pruebas(); //Invocamos funciones

//Otro ejemplo de programación funcional
        System.out.println("-----------------Ejemplo de arrayList de nombres---------------------");
        //declaramos un arrayList de nombres y lo inicializamos
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Luis");
        nombres.add("Pino");
        nombres.add("Pepe");

        //Imprimimos usando una lambda
        nombres.stream().forEach(x -> System.out.println(x)); //OJO los stream se consumen después de recorrerlos
        //stream(): le va pasando cada valor (convertido a stream) a forEach
        //forEach(): va realizando para cada uno de los calores lo q hay entre paréntesis
        //( x....) va obteniendo cada valor que le pasa el forEach

        //Lo convertimos a mayúsculas
        System.out.println("-----------------Lo pasamos a Stream, añadimos (hola, )+ valor actual(Stream x) a mayúsculas------------");
        Stream<String> valores = nombres.stream().map((x) -> "Hola, " + x.toUpperCase()); //OJO los stream se consumen después de recorrerlos

       //Imprimimos cada Uno
        valores.forEach((x)-> System.out.println(x));
//        valores.forEach(x-> System.out.println(x)); SI INTENTAMOS RECORRERLO POR SEGUNDA VEZ, LANZA UN ERROR!!!!!!


//Otro ejemplo usando un filtro para descartar valores
        System.out.println("-----------------Lo pasamos a stream.map(x -> x.mayúsculas) .filtramos( x -> x.empieza con P)------------");

        Stream<String> valores2 = nombres.stream().map((x) -> x.toUpperCase()).filter((x) -> x.startsWith("P"));
        //******Es idéntico a esto:
      //Stream<String> valores2 = nombres.stream()
        //      .map((x) -> x.toUpperCase())
        //      .filter((x) -> x.startsWith("P"));

        //Imprimimos cada uno
        valores2.forEach((x)-> System.out.println(x));


//Otro ejemplo con array de números
        System.out.println("\n-------------Ejemplo con array de números---------------");
        int[] numeros ={1,2,3,4,5,6,7,8,9,10}; //Declaramos e iniciamos un array de números
        var stNumeros = Arrays.stream(numeros); //Le asignamos a una variable tipo var(Genérica) para que lo
        // convierta en tipo de a clase IntStream

        //Para imprimirlo podemos iterar con el IntStream
//        stNumeros.forEach((x)-> System.out.println(x)); //Lo imprimimos
        /**
         ** Lo hemos comentado para poder seguir usando el Stream
         * SEGUIREMOS COMENTANDO PARA IR PROBANDO CADA COSA!!
         **/

        //Otras cosas que podemos hacer con el array (como ya lo hemos usado(Stream), tenemos que volver a cargarlo)
//        var resultado = stNumeros.filter((x) -> x%2 == 0); //Filtramos los pares
//        resultado.forEach((x) -> System.out.println(x));

        //vamos a usar la función (reduce) para mostrar un solo resultado EJ:
//Función que suma los nº pares:

        var resultado = stNumeros
                .filter((x) -> x%2 == 0) //Filtramos los pares
                .filter(x -> x > 5) //Añadimos otro filtro para probar que se pueden poner más en este caso x>5
                .reduce( 0, (x,y) -> {  // y reducimos el resultado a un valor (valor inicial, (variables) -> {
           //codigo que queramos incluyendo return porque está entre llaves "si pusiéramos llaves, iria implícito});
            System.out.println("X es: " + x + " Y es: " + y);
            return x + y;
        });
        System.out.println("Mi suma de pares es: " + resultado);

        //SERÍA EQUIVALENTE A:
//        int sumaTotal = 0;
//        for(int numero : numeros){
//            if (numero % 2 != 0){
//                continue;
//            }
//            sumaTotal += numero;
//        }
//        System.out.println("Mi suma de pares es: " + sumaTotal);





    }




    public static String toMayuscula(String nombre){ //HACE LO MISMO QUE Funcionales.toMayus
        return nombre.toUpperCase();
    }
}
