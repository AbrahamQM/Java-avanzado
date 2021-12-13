package EjPatronSingleton;

public class Aplicacion {
    boolean start = false;
    private static Aplicacion app;

    private Aplicacion(){}

    public static Aplicacion getInstance(){
        if (app ==null){
            app = new Aplicacion();
        }
        return app;
    }

    public void arranca(){
        if(start!=true) {
            System.out.println("Arrancando Aplicación...");
            start = true;
            System.out.println("Aplicacion en funcionamiento");
        }else{
            System.out.println("La aplicación ya estaba iniciada");
        }

    }

    public void para(){
        if (start){
            System.out.println("Deteiendo aplicación...");
            start = false;
            System.out.println("Aplicación detenida");
        }else{
            System.out.println("La aplicación ya estaba detenida");
        }
    }
}
