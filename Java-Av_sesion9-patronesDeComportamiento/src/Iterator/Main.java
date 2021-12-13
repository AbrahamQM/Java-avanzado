package Iterator;

/**
 * Implementando el patron iterator, se trata de implementar una serie de métodos en nuestra clase, de forma que podamos
 * recorrer datos que importe como están almacenados internamente en esa clase (ArrayList, Hashmap, Linkedlist ,...).
 * Para que cualquiera que vaya a utilizar nuestra clase, no tenga que preocuparse de como se almacenan los datos en la misma
 *
 * 1º Creamos una interfaz "UsuarioIterator"
 * 2º Creamos la clase (no implementa la interfaz) "Usuario"
 * 3º Creamos la clase(plural) que si implementa la interfaz "Usuarios"
 */
public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios(); //Creamos un objeto de la clase Usuarios

        //Creamos usuarios para nuestra lista
        usuarios.crear(new Usuario("Uno", 15));
        usuarios.crear(new Usuario("Dos", 25));
        usuarios.crear(new Usuario("Tres", 35));
        usuarios.crear(new Usuario("Cuatro", 55));

        //recorremos la lista
        System.out.println("Imprimimos la lista inicial----------");
        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();// Creamos una variable temporal que irá almacenando cada vez el
            // usuario siguiente
            System.out.println("Usuario: " +usuario.getNombre()+" Edad: "+usuario.getEdad()); //Imprimimos

        }

        //creamos otro usuario
        usuarios.crear(new Usuario("Cinco", 5));
        Usuario usuario = usuarios.siguiente(); //Creamos un objeto usuario para almacenar el nuevo y luego mostrarlo
        //Imprimimos solo ese usuario
        System.out.println("Añadimos el usuario Cinco y lo imprimimos(sólo el Cinco)----------");
        System.out.println("Usuario: " +usuario.getNombre()+" Edad: "+usuario.getEdad());

        //seguimos con la lista sin modificar el puntero
        System.out.println("Imprimimos la lista sin reiniciar el índice----------");
        while (usuarios.hayMas()){
            usuario = usuarios.siguiente();// Creamos una variable temporal que irá almacenando cada vez el
            // usuario siguiente
            System.out.println("Usuario: " +usuario.getNombre()+" Edad: "+usuario.getEdad()); //Imprimimos

        }


        //Reiniciamos el contador para ver como funciona
        usuarios.reinicia();
        //Imprimimos la lista después de reiniciar el índice
        System.out.println("Imprimimos la lista después de reiniciar el índice----------");
        while (usuarios.hayMas()){
            usuario = usuarios.siguiente();// Creamos una variable temporal que irá almacenando cada vez el
            // usuario siguiente
            System.out.println("Usuario: " +usuario.getNombre()+" Edad: "+usuario.getEdad()); //Imprimimos

        }





    }
}
