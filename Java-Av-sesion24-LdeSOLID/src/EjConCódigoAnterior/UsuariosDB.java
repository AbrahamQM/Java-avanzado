package EjConCódigoAnterior;

import java.util.ArrayList;
/* Esta clase define los métodos*/
/*
1º definimos aquí los métodos
2º hacemos que las clases que los implementan, extiendan esta clase
3º añadimos la anotación @Override en los métodos de cada clase que implementen de esta clase
 */

public class UsuariosDB {
    public ArrayList<Usuario> obtener(){return new ArrayList<Usuario>();}
    public Usuario buscar(Usuario usuario){return new Usuario();}
    public void insertar(Usuario usuario){};
    public void borrar(Usuario usuario){};
}
