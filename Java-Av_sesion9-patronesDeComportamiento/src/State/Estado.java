package State;

abstract public class Estado {
    public Telefono telefono; //declaramos un atributo de tipo Teléfono

    public Estado(Telefono telefono){
        this.telefono=telefono;
    }

    abstract public String desbloquear();
    abstract public String abrirCamara();
    abstract public String hacerFoto();


}
