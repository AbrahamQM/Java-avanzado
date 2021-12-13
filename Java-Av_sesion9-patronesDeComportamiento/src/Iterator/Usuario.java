package Iterator;

/**
 * Clase sobre la que trabajaremos
 */
public class Usuario {
    private String nombre;
    private int edad;

    //constuctor vacío PRIVADO para que no lo puedan usar desde fuera y obliguemos a usar los demas constructores
    private Usuario(){}

    //constructor con parámetros PÚBLICO
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    //Creamos Getter (no setter)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
