package ApiRest.JavaAvsesion27ArquitecturaLimpia.Services;

import ApiRest.JavaAvsesion27ArquitecturaLimpia.Entities.Usuario;
import ApiRest.JavaAvsesion27ArquitecturaLimpia.Entities.UsuariosBuilder;
import ApiRest.JavaAvsesion27ArquitecturaLimpia.Repositories.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service //Le indicamos que esto es un servicio
public class UsuariosService {
    public UsuariosDB usuariosDB = new UsuariosDBMemoria();/** OJO CAMBIAR ESTA LÍNEA PARA SELECCIONAR FICHERO**/
//    public UsuariosDB usuariosDB = new UsuariosDBFichero(); //todo revisar usuarios Fichero

    public void Usuarios(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
    }
/**Patron factory implementado en UsuariosDBFactory y UsuariosDBNullable**/
//    UsuariosDBFactory udbf = new UsuariosDBFactory("memoria");
//    UsuariosDB usuariosDB = udbf.getDatabaseInstance();
//
//    public void Usuarios() {}
/**Fin patron factory**/

//    private void Usuarios() {}

    public ArrayList<Usuario> listarUsuarios() {
        return usuariosDB.obtener();
    }

    public Usuario obtenerUsuario(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        return usuariosDB.buscar(usuario);
    }

    public void crearUsuario(Usuario usuario) {
        if (usuariosDB.buscar(usuario) != null) {
            return;
        }

        Usuario usuarioFiltrado = crearUsuarioReal(usuario);  /**Linea sesion 28**/

        usuariosDB.insertar(usuarioFiltrado); //modificado para adecuarlo a lin 37
    }

    public void borrarUsuario(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        usuariosDB.borrar(usuario);
    }

    /** sesion 28 all lo que sigue**/
    private Usuario crearUsuarioReal(Usuario usuario){
        UsuariosBuilder usuariosBuilder = new UsuariosBuilder(usuario.nombreUsuario);

        return usuariosBuilder
                .conNombre(usuario.nombre)
                .conApellidos(usuario.apellidos)
                .conEmail(usuario.email)
                .conNivel(usuario.nivelAcceso)
                .build();
                //Implementado por VRoman  podría fallar si no inicializamos los valores en el UsuariosBuilder

//                .conNombre(usuario.nombre.length() > 0 ? usuario.nombre : "Sin nombre")
//                .conApellidos(usuario.apellidos.length() > 0 ? usuario.apellidos : "Sin apellidos")
//                .conEmail(usuario.email.length() > 0 ? usuario.email : "Sin email")
//                .conNivel(usuario.nivelAcceso > 0 ? usuario.nivelAcceso : 0)
//                .build();

                    //Implementado por mi Comprobado que funciona!

//                .conNombre(usuario.nombre != null ? usuario.nombre : "Sin nombre")
//                .conApellidos(usuario.apellidos != null  ? usuario.apellidos : "Sin apellidos")
//                .conEmail(usuario.email != null  ? usuario.email : "Sin email")
//                .conNivel(usuario.nivelAcceso > 0  ? usuario.nivelAcceso : 0)
//                .build();
    }
}
