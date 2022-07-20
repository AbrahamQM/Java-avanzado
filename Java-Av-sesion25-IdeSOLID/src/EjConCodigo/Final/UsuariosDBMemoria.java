package EjConCodigo.Final;

import java.util.ArrayList;

public class UsuariosDBMemoria implements UsuariosDB, UsuariosDBEstadisticas {
    //Declaración de las variables necesarias para los métodos de la interfaz UsuariosDBEstadisticas
    private int totalEliminaciones =0;
    private int totalInserciones =0;
    //Fin declaración, IMPLEMENTACIÓN AL FINAL DE LA CLASE

    ArrayList<Usuario> usuarios = new ArrayList();

    @Override
    public ArrayList<Usuario> obtener() {
        return usuarios;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        for (Usuario usuarioActual : obtener()) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                return usuario;
            }
        }

        return null;
    }

    @Override
    public void insertar(Usuario usuario) {
        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.toLowerCase().equals(usuario.nombreUsuario.toLowerCase())) {
                return;
            }
        }
        usuarios.add(usuario);
        totalInserciones++; //Añadida para actualizar la estadística
    }

    @Override
    public void borrar(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                usuarios.remove(i);
                totalEliminaciones++;//Añadida para actualizar la estadística
            }
        }
    }

    /*IMPLEMENTACIÓN DE LOS MÉTODOS de la interfaz UsuariosDBEstadisticas*/
    //Hay que modificar los métodos para que incrementen totalInserciones y totalEliminaciones
    @Override
    public int getTotalInserciones() {
        return totalInserciones;
    }

    @Override
    public int getTotalEliminaciones() {
        return totalEliminaciones;
    }
}
