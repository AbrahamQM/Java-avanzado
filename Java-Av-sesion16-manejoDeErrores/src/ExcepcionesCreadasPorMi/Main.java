package ExcepcionesCreadasPorMi;

import ExcepcionNullPointerException.Usuario;

public class Main {
    public static void main(String[] args){
        Usuarios usuarios = new Usuarios();

//Comprobamos que se lanza una excepción de la que hemos implementado en UsuariosException
        System.out.println("---Comprobamos la excepción implementada en UsuariosException:");
        try {
            usuarios.meterUsuario("Alberto");
            usuarios.meterUsuario("Eusebio");

            //Intentamos crear otro usuario alberto para que lance la excepción UsuariosYaRegistrado
            System.out.println("\nIntentamos crear otro usuario alberto para que lance la excepción UsuariosYaRegistrado:");
            usuarios.meterUsuario("Alberto");

        }catch (UsuariosException e){
            System.out.println(e.getMessage());
        }

//Intentamos meter un usuario con nombre corto para que lance UsuariosNombreCortoException
        System.out.println("\nIntentamos meter un usuario con nombre corto para que lance UsuariosNombreCortoException:");
        try{
           usuarios.meterUsuario("Juan");
        }catch (UsuariosException e){
            System.out.println(e.getMessage());
        }


    }
}
