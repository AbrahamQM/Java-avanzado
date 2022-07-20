package DTO;
/* Un DTO (Data Trasnfer Object), es un tipo de objeto que nos permite obtener información
de varias clases en una única llamada*/
public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pepe");
        usuario.añadirVehiculo(new Vehiculo("Coche"));

        Usuario usuario2 = new Usuario("Juan");
        usuario2.añadirVehiculo(new Vehiculo("Coche"));
        usuario2.añadirVehiculo(new Vehiculo("Moto"));

        Usuarios usuarios = new Usuarios();
        usuarios.meterUsuario(usuario);
        usuarios.meterUsuario(usuario2);


        Usuario userInfo = usuarios.obtenerUsuario("Juan"); //Ahora userInfo es el usuario pepe
        //Creaos un usuario para usarlo como buffer y obtener un usuario y poder trabajar con el.
        System.out.println("Listando vehículo/s de: "+userInfo.nombre);

        for (Vehiculo vehiculo : userInfo.vehiculos){
            System.out.println(vehiculo.tipo);
        }

        userInfo = usuarios.obtenerUsuario("Pepe");//Ahora userInfo es el usuario pepe
        System.out.println("Listando vehículo/s de: "+userInfo.nombre);
        for (Vehiculo vehiculo : userInfo.vehiculos){
            System.out.println(vehiculo.tipo);
        }

    }
}
