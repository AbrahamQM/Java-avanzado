package ExcepcionesCreadasPorMi;
/**Clase personalizada de excepciones hija **/
public class UsuariosNombreCortoException extends UsuariosException{
    public UsuariosNombreCortoException(String message) {
        super("Longitud de nombre corta -> " + message);
    }
}
