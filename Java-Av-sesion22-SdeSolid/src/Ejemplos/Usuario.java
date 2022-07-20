package Ejemplos;//Ejemplo 1 de responsabilidad única

public class Usuario {
    public void crearUsuario(String username){}
    public void obtenerUsuario(String username){}

    //Aquí se rompería el principio de responsabilidad única
//    public void enviarEmail(String username){}
    //Solución:
    public void notificarUsuario(String username){
        Mailer mailer = new Mailer();
        mailer.enviarEmail(this);
    }

}

//Para evitar romper el principio, tenemos que crear una clase que se encargue del método enviarEmail
//La creo aquí en lugar de aparte para que se vea más claramente, pero es lo mismo.
class Mailer {
    public void enviarEmail(Usuario usuario) {
        //Código que envía el mail
    }
}