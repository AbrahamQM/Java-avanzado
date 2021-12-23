package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        File fichero = null;
        FileReader fr = null;

        //Arithmetic exception tratando de hacer una división entre dos números, siendo el que divide 0.
        try{
            System.out.println(dividir(5,0));
        }catch(ArithmeticException e){
            System.out.println("Excepción aritmética: "+ e.getMessage());
        }

        //ArrayIndexOutOfBounds con un array de 6 elementos, tratando de alcanzar el noveno elemento.
        try{
            System.out.println(array[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Excepción de tipo: " + e.getMessage());
        }

        //FileNotFound tratando de acceder a un fichero que no existe.
        try{
            fichero = new File("Enunciado.txt");
            fr= new FileReader(fichero);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }finally{
            try{
                if(fr != null){
                    fr.close();
                }
            }catch (Exception e){
                System.out.println("No se pudo cerrar el archivo, causa: " + e.getMessage());
            }
        }
    }

    public static int dividir(int numerador, int denominador){
        return numerador/denominador;
    }
}
