package Singleton;

public class Aplicacion {
    boolean isRunning = false;
//Implementamos el patron singleton:
    private static Aplicacion aplicacion; //1º Creamos una variable PRIVADA y ESTÁTICA del mismo tipo que la clase


    private Aplicacion(){} //2ºConstructor vacío PRIVATE

    public static Aplicacion getInstance(){ //Implementamos la función getInstance
        if (aplicacion == null){
            aplicacion = new Aplicacion();
        }
        return aplicacion;
    }

    //métodos
    public void Run(){ //esta función hace que el atributo isRunning cambie a true
        if (!isRunning){ //comprobamos si no estaba funcionando
            System.out.println("Iniciando Aplicación");
            isRunning = true;
        }else {       //si ya estaba funcionando
            System.out.println("Ya estaba en ejecución!!");
        }

    }
    public void Stop(){ //esta función hace que el atributo isRunning cambie a true
        if (isRunning){ //comprobamos si no estaba funcionando
            System.out.println("Deteniendo Aplicación");
            isRunning = false;
        }else {       //si ya estaba funcionando
            System.out.println("Ya estaba detenida!!");
        }

    }





}
