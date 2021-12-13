package Builder;

/**
 * El patron builder, nos permite crear objetos complejos PASO A PASO en lugar de tener un "megaconstructor" con muchos
 * parámetros o muchos métodos.
 *
 * Lo conseguimos haciendo que un método devuelva su propia instancia.
 * 1º CREAMOS LA CLASE SOBRE LA QUE TRABAJAREMOS: (Vehiculo.java)
 * 2º CREAMOS LA CLASE ObjetoBuilder: (VehiculoBuilder.java)
 *  -Declaramos un objeto de la clase principal sobre la que trabajaremos: (Vehiculo vehiculo;)
 *  -Creamos un constructor con un parámetro que lo identifique (o sin parámetros):
 *      public CocheBuilder(String marca){
 *          vehiculo = new Vehiculo();
 *          vehiculo.setMarca(marca);
 *      }
 *  -Creamos los Setters ESPECIALES (todos devuelven this;) ej:
 *      public CocheBuilder setMotor(String motor){
 *         vehiculo.motor = motor;
 *         return this;
 *         }
 *  -Creamos el método build() que devolverá nuestro objeto de la clase principal:
 *      public Vehiculo build(){
 *      return this.vehiculo;
 *      }
 *
 * 3º En el Main o donde queramos usar el patrón, declararemos los objetos usando programación funcional (o fluida)
 *
 */

public class Main {
    public static void main(String[] args) {
//Forma tradicional
//        Vehiculo vehiculo = new Vehiculo();
//        vehiculo.setMarca("Skoda");
//        vehiculo.setMotor("Diesel");
//        vehiculo.setTipo("Combustión");
//        vehiculo.setPuertas(5);

//Usando patrón builder
        Vehiculo coche = new CocheBuilder("Skoda")
                .setPuertas(5)
                .setMotor("Diesel")
                .setTipo("Combustion")
                .build();

//Comprobamos el objeto imprimiéndolo
        System.out.println("Vehículo marca: "+ coche.getMarca()
                + "\nMotor: " + coche.getMotor()
                + "\nTipo: "+coche.getTipo()
                + "\nPuertas: "+ coche.getPuertas());

//Prueba creando un vehículo sin indicarle la marca en el constructor ****HECHO POR MI****
        System.out.println("\n-----------Entramos en MOTO------------");
        Vehiculo moto = new CocheBuilder()
                .setMarca("Suzuki")
                .setMotor("Supersónico")
                .setPuertas(0)
                .build();
        System.out.println("Vehículo marca: "+ moto.getMarca()
                + "\nMotor: " + moto.getMotor()
                + "\nTipo: "+moto.getTipo()
                + "\nPuertas: "+ moto.getPuertas());


    }
}
