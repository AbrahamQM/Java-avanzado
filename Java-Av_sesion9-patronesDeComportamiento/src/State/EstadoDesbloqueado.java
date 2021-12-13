package State;

public class EstadoDesbloqueado extends Estado{


    public EstadoDesbloqueado (Telefono telefono){
        super(telefono); //Invoca el constructor padre
    }

    //Implementamos los métodos
    @Override
    public String desbloquear() {
        return "desbloquear(): El móvil ya estaba desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(): Abriendo cámara...., puedes hacer foto.";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): Cámara cerrada, Abra la cámara antes de hacer la foto,";
    }
}

