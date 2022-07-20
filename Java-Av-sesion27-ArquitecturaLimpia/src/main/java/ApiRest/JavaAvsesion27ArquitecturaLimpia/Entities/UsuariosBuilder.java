package ApiRest.JavaAvsesion27ArquitecturaLimpia.Entities;
/**Nuevo en sesion28**/
public class UsuariosBuilder {
    private Usuario usuario = new Usuario();

    public UsuariosBuilder(){}

    public UsuariosBuilder(String nombreUsuario){
        usuario.nombreUsuario = nombreUsuario;
        /**Sesión 28, para que funcione UsuariosService.crearUsuarioReal()**/
        usuario.nombre = "";
        usuario.apellidos = "";
        usuario.email = "";
        usuario.nivelAcceso = 0;//Hasta aquí
    }

    public UsuariosBuilder conNombre(String nombre){
        usuario.nombre = nombre;
        return this;
    }
    
    public UsuariosBuilder conApellidos(String apellidos){
        usuario.apellidos = apellidos;
        return this;
    }

    public UsuariosBuilder conEmail(String email){
        usuario.email = email;
        return this;
    }

    public UsuariosBuilder conNivel(int nivel){
        usuario.nivelAcceso = nivel;
        return this;
    }


    public Usuario build(){
        return usuario;
    }


}
