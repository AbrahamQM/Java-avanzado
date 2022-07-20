package ExcepcionesCreadasPorMi;

import ExcepcionNullPointerException.Usuario;

import java.util.ArrayList;

public class Usuarios {
    ArrayList<String> usuarios = new ArrayList<>();

/**1ª Prueba usando UsuariosException**/
//    public void meterUsuario(String nombre) throws UsuariosException{ //Indicamos que esta función puede devolver una
//        //excepción de tipo UsuariosException
//
//        for(String usuario : usuarios) { //comprobamos si el usuario ya existe en nuestra lista
//            if (usuario == nombre) {
//                throw new UsuariosException("Error al meter el usuario: " + nombre);
//            }
//        }
//        //si no existe lo añadimos:
//        usuarios.add(nombre);
//        System.out.println("Usuario metido: " + nombre);
//    }

/**  2ª Prueba usando jerarquía de Excepciones y añadiendo contexto al error **/
    public void meterUsuario(String nombre) throws UsuariosYaRegistradoException, UsuariosNombreCortoException { //Indicamos que esta función puede devolver una
    //excepción de tipo UsuariosException

        for(String usuario : usuarios) { //comprobamos 1º clase hija, UsuariosYaRegistradoException
            if (usuario == nombre) {
                throw new UsuariosYaRegistradoException(nombre);
            }
        }


        if (nombre.length() < 5){ //Comprobamos la 2º clase hija, UsuariosNombreCortoException
            throw new UsuariosNombreCortoException(nombre);
        }
        //si no da error, lo añadimos:
        usuarios.add(nombre);
        System.out.println("Usuario metido: " + nombre);
    }


}
