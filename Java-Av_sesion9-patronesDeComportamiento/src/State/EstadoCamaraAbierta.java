package State;

public class EstadoCamaraAbierta extends Estado{


    public EstadoCamaraAbierta(Telefono telefono){
        super(telefono); //Invoca el constructor padre
    }

    //Implementamos los métodos
    @Override
    public String desbloquear() {
        return  "desbloquear(): El móvil ya estaba desbloqueado!!!!.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La cámara ya estaba abierta, puedes hacer la foto!!!!!";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));//Cambiamos el estado a hacer foto
        return "La foto se va a disparar ya ...";
    }
}
