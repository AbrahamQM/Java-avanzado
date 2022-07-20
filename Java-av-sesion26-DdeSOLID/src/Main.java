/*
***D de Solid o Principio de inversión de dependencias:
* *Implica que las dependencias tienen que estar en las abstracciones, no en las concreciones.
* *Debemos abstraer nuestro código de forma que los detalles estén en el nivel más bajo
* posible (no en las capas superiores).
* *Las abstracciones no deben depender de las concreciones, sino que las concreciones deben depender
* de las abstracciones. */

public class Main {
}
/**El ejemplo con código de la sesión anterior ya tiene implementado este principio,
 * hicimos que lo cumpliera al implementar el principio de Liskov en el ejercicio**/
//Ej: el método insertar() depende de la abstracción (Interfaz UsuariosDB)
//pero: el uso de los métodos (en el main) depende de la interfaz, nunca de las clases concretas
//(UsuariosDBMemoria) y (UsuariosDBFichero)

//Así que Al usar esos métodos, no conocemos los detalles de los mismos (en cada clase concreta).