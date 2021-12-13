package Strategy;
/**
 * En esta clase vamos a trabajar con un fichero de texto, que contendrá los usuarios
 */

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero  implements Usuarios{
    private String ficheroUsuarios = "usuarios.txt";
    private PrintStream fichero;  //Lista de usuarios

    public UsuariosFichero(){
        try {
            fichero  = new PrintStream(ficheroUsuarios);

        } catch (Exception e) {
            System.out.println("No puedo abrirlo: " +e.getMessage());
        }
    }

    @Override
    public void crear (String nombre){ //método que añade un usuario
        fichero.println(nombre);
        System.out.println("UsuariosFichero--Añadiendo usuario: "+ nombre);
    }
    @Override
    public ArrayList<String> listar(){  //método que nos va a devolver el ArrayList de los usuarios.
        ArrayList<String> usuarios = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(ficheroUsuarios)); //La clase Scanner nos permite leer un fichero
            while (scanner.hasNext()){ //mientras haya más contenido en el fichero
                usuarios.add(scanner.next()); //añadimos el siguiente usuario registrado desde scanner.next() "patron iterador"
                //scanner.next() devolverá el siguiente usuario
            }
            scanner.close(); //cerramos el scanner
        }catch (Exception e){
            System.out.println("No puedo abrirlo: " +e.getMessage());
        }

        return usuarios;
    }
}
