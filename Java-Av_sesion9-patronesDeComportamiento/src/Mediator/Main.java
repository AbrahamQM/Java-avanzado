package Mediator;

/**
 * Imaginemos que el patron mediator, es una especie de controlador aéreo Al que le hablan los aviones. y el controlador,
 * los organiza. (recibe mensaje de av1 para av2)(envía mensaje a av2 y recibe la respuesta)(envía mensaje a av1 y recibe la respuesta)
 * SIMILAR A UN PROXY
 *
 * ---Utiliza clases abstractas
 * --Parece un patron observador, pero todos los elementos pueden hablar y recibir
 *
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediador = new MediadorConcreto(); //Creamos un mediador

        //Creamos colegas
        Colega colega1 = new ColegaConcreto1();
        Colega colega2 = new ColegaConcreto2();

        //Registramos con el mediador
        mediador.registra(colega1);
        mediador.registra(colega2);


        //Hacemos que uno hable
        colega1.envia(); //ColegaConcreto1 envia y los demás reciben

        //creo y registro otro colega
        Colega colega3 = new ColegaConcreto3();
        mediador.registra(colega3);

        //Hacemos que hable alguien
        colega3.envia();

    }
}
