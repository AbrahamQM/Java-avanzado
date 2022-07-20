package Ej1;
/*
 ***D de Solid o Principio de inversión de dependencias:
 * *Implica que las dependencias tienen que estar en las abstracciones, no en las concreciones.
 * *Debemos abstraer nuestro código de forma que los detalles estén en el nivel más bajo
 * posible (no en las capas superiores).
 * *Los detalles no deben depender de las abstracciones, sino que las abstracciones deben depender
 * de los detalles(en este ejemplo es la implementación del método guardar() dentro de cada clase).
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.setNombre("Pepe");

//        DatabaseMySQL db = new DatabaseMySQL();
//        db.guardar(usuario);

//Hasta aquí un ejemplo sencillo sin implementar la D de SOLID
//1º Ahora crearíamos una interfaz ej: "DatabaseStore" y hacemos que DatabaseMySQL la implemente
//2º Creamos otra clase ej DatabaseSQLite que también implementará DatabaseStore
//IMPLEMENTAMOS LA INVERSIÓN DE DEPENDENCIAS:
    //Comentamos las líneas 16 y 17(Main), ya no vamos a instanciar el objeto de esa forma
    //Creamos el envoltorio:
        //IMPORTANTE!!!! LE PASAMOS UN OBJETO DE LA ITERFAZ
        // método GuardarEnBaseDeDatos(DatabaseStore dbs, Usuario usuario);
    //Creamos un nuevo objeto de una de las clases que implementan DatabaseStore,
        // NombreInterfaz nombreObj = new ClaseQueImplementaInterfaz();
        // ej:
         DatabaseStore db = new DatabaseMySQL();
    //Ahora podemos usar el método declarado en la interfaz:
         GuardarEnBaseDeDatos(db, usuario);
/**Ahora se cumple el principio de inversión de dependencias (D de SOLID)
 *A este método GuardarEnBaseDeDatos() le da igual si le pasamos un objeto de la clase DatabaseMySQL o
 * DatabasSQLite.
 *Lo que hace que los objetos que le pasamos al método sean "opacos", (los métodos que los utilicen
 *no conocen los detalles del objeto en si mismo).**/
 //Ahora que está implementado el principio de inversión de dependencias, podemos usar el método también asi:
        DatabaseSQLite dbSQLite = new DatabaseSQLite();
        DatabaseMySQL dbMySQL = new DatabaseMySQL();
        System.out.println("\nUsamos función GuardarEnBaseDeDatos() con objeto DatabaseMySQL:" );
        GuardarEnBaseDeDatos(dbMySQL, usuario);
        System.out.println("Usamos función GuardarEnBaseDeDatos() con objeto DatabaseSQLite:" );
        GuardarEnBaseDeDatos(dbSQLite, usuario);

    }


    public static void GuardarEnBaseDeDatos(DatabaseStore dbs, Usuario usuario){
        dbs.Guardar(usuario); //Sabemos que cualquier objeto que implemente DatabaseStore,
        // va a tener implementada esa función guardar();
    }
}
