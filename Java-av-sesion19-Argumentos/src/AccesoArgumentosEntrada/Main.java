package AccesoArgumentosEntrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("parámetros recibidos: " + args.length);

        for(String arg: args){
            System.out.println("Argumento es: " + arg);
        }


        System.out.println( "\n---Usamos los argumentos para determinar un comportamiento:");
        if(args[0].equalsIgnoreCase("UNO")){ //equalsIgnoreCase Ignora si es mayúsculas o no
            System.out.println("Hola");
        }else if(args[0].equalsIgnoreCase("dos")){
            System.out.println("Adios");
        }



    }
}
