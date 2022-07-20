package ApiRest.JavaAvsesion27ArquitecturaLimpia.Repositories;
/**Esta es la clase donde haremos las principales modificaciones*/
import ApiRest.JavaAvsesion27ArquitecturaLimpia.Entities.Usuario;

import java.util.ArrayList;

public interface UsuariosDB {

    ArrayList<Usuario> obtener();
    Usuario buscar(Usuario usuario);
    void insertar(Usuario usuario);
    void borrar(Usuario usuario);
}
