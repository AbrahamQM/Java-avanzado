package ApiRest.JavaAvsesion27ArquitecturaLimpia.Repositories;

import ApiRest.JavaAvsesion27ArquitecturaLimpia.Entities.Usuario;
import ApiRest.JavaAvsesion27ArquitecturaLimpia.Stadistics.UsuariosDBEstadisticas;

import java.util.ArrayList;

public class UsuariosDBNullable implements UsuariosDB, UsuariosDBEstadisticas {
    private int totalEliminaciones =0;
    private int totalInserciones =0;

    @Override
    public ArrayList<Usuario> obtener() {
        return null;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return null;
    }

    @Override
    public void insertar(Usuario usuario) {

    }

    @Override
    public void borrar(Usuario usuario) {

    }

    @Override
    public int getTotalInserciones() {
        return totalInserciones;
    }

    @Override
    public int getTotalEliminaciones() {
        return totalEliminaciones;
    }
}


