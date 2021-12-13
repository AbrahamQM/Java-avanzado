package State;

public class EstadoBloqueado extends Estado{


    public EstadoBloqueado(Telefono telefono){
        super(telefono); //Invoca el constructor padre
    }

    //Implementamos los métodos
    @Override
    public String desbloquear() { //éste método va a invocar el siguiente estado (EstadoDesbloqueado)
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquear(): Móvil desbloqueado, procede...";
    }

    @Override
    public String abrirCamara() {
        return "abrirCámara(): La camara está bloqueada, Desbloquea el móvil antes";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): La cámara está bloqueada, Desbloquea el móvil antes";
    }
}
