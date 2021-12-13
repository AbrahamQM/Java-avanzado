package Singleton;


/**
 * El patron singleton se usa para evitar que se creen nuevas instancias de la clase
 * Para que solo creemos la instancia una vez, y se reutilice
 */
public  class Singleton {
//Implementación de Singleton
    private static Singleton singleton; //1º Creamos una variable PRIVADA y ESTÁTICA del mismo tipo que la clase (Singleton.java)

    int contador;

    private Singleton() { }    //2º Creamos un constructor private vacío, para que no pueda ser invocado desde fuera
    //de la clase. Así evitamos que se creen más instancias usando Singleton singleton = new Singleton();

    /**
     * Aqui esta lo mas importante
     **/
    //La función getInstance implementada a continuación, será la única forma de crear in objeto de la clase Singleton
    public static Singleton getInstance(){ //3º implementamos una función public static que devuelve las instancias(objetos)
        if (singleton == null) { //Comprobamos si no ha creado esa instancia de la clase, si no se ha creado, la creamos
            singleton = new Singleton(); //Crea la instancia de la clase
        }
        return singleton; //Le devolvemos la instancia(objeto) ÚNICO, ya que (si se había creado con anterioridad, no se
        //creará de nuevo) y, (si no se había creado anteriormente, se crearía dentro del if)
    }


    //Getter y setter
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
