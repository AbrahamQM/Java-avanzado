package EjConCódigoAnterior;
/*Vamos a hacer que esta clase registre todos los cambios en la bbdd SIN MODIFICAR LA CLASE UsuariosDB
Para ello haremos que extienda la clase padre UsuarioDB.
1º Comprobamos que funciones modifican el fichero o la bbdd: "insertar" "borrar"
2º Extender la funcionalidad de dichas funciones con @override
3º En la clase Usuarios, en lugar de utilizar la clase UsuariosDB, utilizaremos la clase que la extiende: UsuariosDBEstadisticas
 */
public class UsuariosDBEstadisticas extends UsuariosDB{
    private int totalInserciones=0;
    private int totalEliminaciones=0;

    @Override
    public void insertar(Usuario usuario) {
        super.insertar(usuario);
        totalInserciones++;
    }

    @Override
    public void borrar(Usuario usuario) {
        super.borrar(usuario);
        totalEliminaciones++;
    }

    public int getTotalInserciones() {
        return totalInserciones;
    }

    public int getTotalEliminaciones() {
        return totalEliminaciones;
    }
}
