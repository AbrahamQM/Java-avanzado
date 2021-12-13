package EjPatronSingleton;

public class Main {
    public static void main(String[] args) {
        Aplicacion app = Aplicacion.getInstance();

        app.arranca(); //arrancamos el objeto coche
        Aplicacion app2 = Aplicacion.getInstance(); //Creamos otra supuesta instancia que debería ser el mismo objeto coche(singleton)
        //Imprimimos los punteros a memoria para comprobar
        System.out.println("\napp en memoria: " + app +" --Estado actual app ¿arrancado?: " + app.start);
        System.out.println("app2 en memoria: " + app2+" --Estado actual app ¿arrancado?: " + app2.start);
        System.out.println("\n---Intentando arrancar app2:");
        app2.arranca();
        System.out.println("\napp en memoria: " + app +" --Estado actual app ¿arrancado?: " + app.start);
        System.out.println("app2 en memoria: " + app2+" --Estado actual app ¿arrancado?: " + app2.start);
        System.out.println("\n---Intentando apagar app:");
        app.para();
        System.out.println("\nCoche en memoria: " + app +" --Estado actual app ¿arrancado?: " + app.start);
        System.out.println("app2 en memoria: " + app2+" --Estado actual app ¿arrancado?: " + app2.start);
        System.out.println("\n---Intentando apagar app2:");
        app2.para();
        System.out.println("\napp en memoria: " + app +" --Estado actual app ¿arrancado?: " + app.start);
        System.out.println("app2 en memoria: " + app2+" --Estado actual app ¿arrancado?: " + app2.start);



    }


}
