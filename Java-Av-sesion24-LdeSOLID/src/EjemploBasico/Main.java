package EjemploBasico;/*
Principio de sustitución de Liskov (L se SOLID):
Si tenemos una clase heredada, deberíamos poder sustituir una clase hija por la clase padre, sin cambiar
nada de mi código principal

 */


public class Main {
    public static void main(String[] args) {
        Aritmetica ari = new AritmeticaMejorada();
        System.out.println(ari.suma(2,2));

        //Suponemos que queremos extender las capacidades o funcionalidades de la clase Aritmética
        //Creamos AritmeticaMejorada
/* si cambiáramos la instanciación de la Lin(11), usando la nueva clase, el código fallaría en la
siguiente línea (20) porque la clase Aritmética no implementa el método división, y no se cumpliría el
principio de Liskov
*/
//        ari.division(2,2);

/*Para resolverlo: Convertimos la clase Aritmética en abstracta y,
* Adaptamos las clases Aritmética y AritmeticaMejorada (1º MODIFICACIÓN)
* Después de adaptarlas, también hemos creado una nueva clase AritmeticaMejoradaChivata que también extiende de
* Aritmetica, pero ejecuta los métodos con diferencias.
*
* Ahora podíamos instanciar a cualquiera de las clases hijas indistintamente. Pero no a la clase padre.
* Haríamos UNA 2º MODIFICACIÓN PARA QUE SE PUEDA INSTANCIAR A LA CLASE PADRE:
* Quitando la palabra abstract de la clase Aritmética y haciendo que los métodos tengan cuerpo
* */
        System.out.println(ari.division(10,2));


    }
}
