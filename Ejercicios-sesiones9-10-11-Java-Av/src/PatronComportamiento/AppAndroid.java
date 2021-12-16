package PatronComportamiento;

public class AppAndroid  implements Receptor{
    @Override
    public void notificacion(int actPendientes) {

        System.out.println("Apreciado usuario de SmartHouse APP, hay " + actPendientes +
                " actualizaciónes pendientes,\npinche en el siguiente link (https://www.smarthouse/actualizarAndroid)" +
                " para actualizar\no diríjase a Play Store para actualizar\n\n");

    }
}
