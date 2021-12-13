package State;

public class EstadoHacerFoto extends Estado{


    public EstadoHacerFoto(Telefono telefono){
        super(telefono); //Invoca el constructor padre
    }

    //Implementamos los métodos
    @Override
    public String desbloquear() {
        return "desbloquear(): EL TELÉFONO YA ESTABA DESBLOQUEADO!!!!.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): LA CÁMARA YA ESTABA ABIERTA!!!!.";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));//VOLVEMOS AL ESTADO INICIAL CON EL TELÉFONO BLOQUEADO
        return "******************************\n*****FOTO REALIZADA******";
    }
}

