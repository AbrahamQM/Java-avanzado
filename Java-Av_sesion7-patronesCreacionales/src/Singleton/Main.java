package Singleton;

/**
 * El factor Singleton, sirve para reaprovechar un objeto y evitar que se creen mas instancias del mismo.
 */
public class Main {
    public static void main(String[] args) {
//Ejemplo de como se haría sin el patrón Singleton: (all lo comentado a continuación)
//        Singleton singleton = new Singleton();
//        singleton.setContador(15);
//        System.out.println(singleton.getContador());
//        System.out.println(singleton);
//
//
//        Singleton singleton2 = new Singleton();
//        singleton2.setContador(10);
//        System.out.println(singleton2.getContador());
//        System.out.println(singleton2);

        Singleton singleton = Singleton.getInstance(); //la función getInstance implementada en la clase Singleton,
        //será la única forma de crear in objeto de la clase Singleton
        singleton.setContador(15);

        Singleton singleton2 = Singleton.getInstance();


        System.out.println("Valor de singleton: "+singleton.getContador()+ " en memoria: "+singleton); //mostramos valor y zona de memoria
        System.out.println("Valor de singleton2: "+singleton2.getContador()+ " en memoria: "+singleton2);

//Creamos la clase Aplicación para realizar otra prueba más práctica
        System.out.println("\n-----Ahora usamos el objeto singleton Aplicacion.java-----");
        //Hacemos pruebas

        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();

        System.out.println("Puntero a objeto app: "+app + "\nPuntero a objeto app2:" +app2);
        //Ejecutamos el método y mostramos resultados
        System.out.println("\nIniciando aplicaciones");
        app.Run();
        app2.Run();

        System.out.println("app is running?: " + app.isRunning);
        System.out.println("app2 is running?: " + app2.isRunning);

        System.out.println("\nDeteniendo aplicaciones");
        app.Stop();
        app2.Stop();

        System.out.println("app is running?: " + app.isRunning);
        System.out.println("app2 is running?: " + app2.isRunning);






    }
}
