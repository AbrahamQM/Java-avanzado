package Encapsulacion;
/*Esta clase se va a encargar de enviar el correo de bienvenida
---para cumplir el principio de que cada clase se encarga de una sola cosa*/
public class EnviarCorreo {
    public void EnviarCorreoDeBienvenida(String destinatario){
        System.out.println("Enviando mail de bienvenida a: "+ destinatario);
    }
}
