package Factory;
/**
 * El patrón factory sirve para crear una jerarquía de clases
 * esta clase Factory, es la clave para implementar el patrón Factory
 *
 * 3º Implementar la claseFactory con un constructor PRIVATE sin parámetros y otro con el/los parámetros que nos
 * interesen (método standard)
 */
public class PrecioFactory {
    //3º Creamos una variable de tipo (nuestra Interfaz "ENVOLTORIO")
    Precio precio;


    //1º Ocultar el constructor con private
    private PrecioFactory(){}; //Si no pasan el pais, no va a hacer nada.

    //2º Creamos el método Standard
    public PrecioFactory(String pais){ //Si le pasamos un pais, es cuando vamos a ver como funciona
       if (pais.equalsIgnoreCase("España")) {
           System.out.println("Pais España, precio en €:");
           precio = new PrecioEuro(); //4º---- le asignamos a nuestra variable(ENVOLTORIO), la clase que nos interese
           System.out.println(precio.getPrecio() + " Desde PrecioFactory.");
       }else if(pais.equalsIgnoreCase("UK")){
           System.out.println("Pais UK, precio en Libras:");
           precio = new PrecioGBP(); //4º---- le asignamos a nuestra variable(ENVOLTORIO), la clase que nos interese
           System.out.println(precio.getPrecio() + " Desde PrecioFactory.");
       }else{
           System.out.println("Pais " +pais+ " , precio en USD:");
           precio = new PrecioUSD(); //4º----le asignamos a nuestra variable(ENVOLTORIO), la clase que nos interese
           System.out.println(precio.getPrecio()+" Desde PrecioFactory.");
       }
    }

    //Este método voy a usar solo con el pais UK en el Main, para ver que queda más bonito el código
    public double getPrice(){
        return precio.getPrecio();
    }

}
