package ExcepcionesCreadasPorMi;
/**Clase personalizada de excepciones hija **/
//Aqui vamos a crear una jerarquía de Excepciones haciendo que extienda de la clase UsuariosException que extiende de Exception
public class UsuariosYaRegistradoException extends UsuariosException{

    //Constructor
    public UsuariosYaRegistradoException(String message){
        super ("Ya registrado-> " + message); //Añadimos mensaje "Ya registrado" al que nos pasa la
        // clase padre que lo invoca(UsuariosException) "Error al registrar ->  + message"
        // El mensaje es el nombre del usuario que pasamos al lanzar el error en clase Usuarios y que recoge UsuariosException
    }


}
