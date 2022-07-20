package EjConCódigoAnterior;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
/*
Imaginemos que queremos que quede un registro de cuantos usuarios se han creado, modificado, borrado...
Para hacerlo cumpliendo el principio Open-Closed, no podemos modificar la clase.
Debemos crear una clase nueva: UsuariosDBEstadisticas
 */

public abstract class UsuariosDB {
    public String ficheroDatos = "usuarios.txt";


    public ArrayList<Usuario> convertirUsuariosFicheroEnArrayList() {
        ArrayList<Usuario> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return usuarios;
    }

    public void insertar(Usuario usuario){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos, true);
            PrintStream printStream = new PrintStream(fileOutputStream);

            printStream.println(separarUsuarioPorComas(usuario));
            printStream.flush(); //Obliga a guardar en el fichero los datos que tengo en memoria
            printStream.close();


        } catch (Exception e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    private String separarUsuarioPorComas(Usuario usuario) {
        return usuario.nombreUsuario + ","
                + usuario.nombre + ","
                + usuario.apellidos + ","
                + usuario.email + ","
                + usuario.nivelAcceso;
    }


    public void borrar(Usuario usuario){
        ArrayList<Usuario> usuarios = convertirUsuariosFicheroEnArrayList();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                usuarios.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Usuario usuarioActual : usuarios) {
                String usuarioComas = separarUsuarioPorComas(usuarioActual);
                printStream.println(usuarioComas);
            }
            printStream.flush();//fuerza guardado en fichero
            printStream.close();
        } catch (Exception e) {
        }
    }

}
