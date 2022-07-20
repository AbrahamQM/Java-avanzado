package Encapsulacion;
/* Para encapsular las clases tenemos que declarar las propiedades como PRIVATE*/
public class Usuario {
    private String nombre;
    private int edad;
    private String email;
    private long altura;
    private Acceso accesos = new Acceso();//Este objeto se encargará de contar los accesos al nombre

/*En cambio las funciones getter y setter deben ser PUBLIC, para poder acceder a ellas desde fuera de la clase*/
    public Acceso getAccesos(){
        return accesos;
    }

    public String getNombre() {
        //Cada vez que se acceda al nombre del usuario, vamos a incrementar el contador de Acceso
        accesos.setIntentos(accesos.getIntentos()+1);
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        /*En este ejemplo, vamos a enviar automáticamente un correo de bienvenida al registrar un nuevo usuario*/
        EnviarCorreo correo = new EnviarCorreo();
        correo.EnviarCorreoDeBienvenida(nombre);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }
}
