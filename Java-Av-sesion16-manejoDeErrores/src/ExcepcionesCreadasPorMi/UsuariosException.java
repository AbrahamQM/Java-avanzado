package ExcepcionesCreadasPorMi;
/**Clase personalizada de excepciones padre **/
//Es obligatorio extender a la clase padre para crear nuestras propias excepciones
public class UsuariosException extends Exception {

    //Creamos un constructor de excepciones
    public UsuariosException(String message){
       //Invocamos al constructor de la clase padre pasándole los parámetros que recibe la excepción.
       super ("Error al registrar -> " + message); //Añadimos mensaje "Error al registrar" al que nos pasa la
        // clase que lo invoca(usuarios) "nombre"
        // El mensaje es el nombre del usuario que pasamos al lanzar el error en clase Usuarios


        for(StackTraceElement elemento : getStackTrace()){ //mostramos algunos de los datos del StackTrace
            System.out.println("Error en clase: "+elemento.getClassName() + " Método: " + elemento.getMethodName());
            //getClassName: Nombre de la clase donde se produce la excepción
            //getMethodName: Nombre del método donde se produce la excepción
            //Se pueden poner muchos más datos de la traza del error
        }

    }


}
