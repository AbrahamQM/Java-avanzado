package ModificarExcepciones;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        a();
        try {
//            dividirPorCero(5, 1);  //Para pruebas con método dividirPorCero
            System.out.println(dividirPorCero(5, 2));
        }catch (ArithmeticException e){
            System.out.println("Hay una excepción aritmética");
        }catch (IOException e){
            System.out.println("Hay una excepción IO");
        }catch (Exception e){ //Exception es la clase padre de excepciones, capturaría las que no hemos
            // capturado anteriormente
            System.out.println("Hay una excepción de tipo: " + e.getClass() + " " + e.getMessage());
        }
    }

//Método para modificar el tipo de excepción que lanzamos
    public static int dividirPorCero(int valor, int dividendo) throws ArithmeticException, IOException {
        int resultado = 0;
        try {
            resultado = valor / dividendo;
            if(dividendo == 1){ //Para comprobar cómo devolver  otro tipo de excepción
                throw new IOException();
            }
        } catch (ArithmeticException e){
        throw new ArithmeticException();
        }

        // Código que modifica el tipo de excepción.------Comentado para hacer mas pruebas
//        try {
//            resultado = valor / 0;
//            if(dividendo == 1){
//                throw new IOException();
//            }
//        }catch (ArithmeticException e){
//            throw new IOException(); //Aquí hacemos que se lance una excepción de tipo diferente
//            // a la que hemos capturado
// //           throw e;
//        }
        throw new RuntimeException("Esto ha explotado"); //Para probar otro tipo de excepciones y especificar
        // el mensaje de la excepción


//        return resultado;

    }


//Métodos para comprobar la pila en el debugger
    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        try{
            int valor = 5 / 0;
        }catch(Exception e){
            System.out.println("Esto es una division por cero");

            for (StackTraceElement valor : e.getStackTrace()){
                System.out.println(" -> Linea: " + valor.getLineNumber() + "  " +valor.getMethodName());
            }
        }
    }

}
