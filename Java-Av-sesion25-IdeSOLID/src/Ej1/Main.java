package Ej1;

/*Principio de segregación de la interfaz:
*no deberíamos utilizar interfaces grandes o con métodos que son innecesarios para sus implementadores
*/



public class Main {
    public static void main(String[] args) {


    }

    /*Esta función no sería posible porque Reloj no implementa los métodos de RelojInteligente*/
//    public void operarReloj(Reloj reloj){
//        reloj.obtenerCorreos();
//    }
    /*Alternativas:*/
    //1
//    public void operarReloj(Object o){
//        if (o instanceof RelojInteligente){
//            o.enviarMensaje();
//        }else{
//            System.out.println("No es un reloj inteligente, imposible enviar mensaje");
//        }
//    }
    //2
//    public void operarReloj(RelojInteligente reloj){
//        reloj.obtenerCorreos();
//    }



}
