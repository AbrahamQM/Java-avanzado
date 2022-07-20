package ExcepcionNullPointerException;

public class Main {
    public static void main(String[] args) {
        //Probamos tratamiento de error al pasarle valor null, para ello hemos creado la clase Usuario
// También creamos un constructor de la línea 44 en Usuarios

        Usuario user= null;
        Usuarios usuarios = new Usuarios(user);

        System.out.println("\n---Estamos en la prueba con user = null");
        try {
            for (Usuario actual : usuarios.getUsuarios){
                System.out.println(actual.name); //da la excepción por que el valor name está vacío
            }
        }catch (NullPointerException e){
            System.out.println("EXCEPCIÓN, ES NULO!");
        }finally { //Lo que esté dentro funcionará siempre (tanto cuando hay error como cuando no)
            //se usa mucho cuando estamos trabajando con ficheros, para cerrar el fichero
            System.out.println("Finally");
        }


    }
}
