package EjConCodigo.Final;
/**Esta es la clase donde haremos las principales modificaciones*/
import java.util.ArrayList;

interface UsuariosDB {

    ArrayList<Usuario> obtener();
    Usuario buscar(Usuario usuario);
    void insertar(Usuario usuario);
    void borrar(Usuario usuario);
}
