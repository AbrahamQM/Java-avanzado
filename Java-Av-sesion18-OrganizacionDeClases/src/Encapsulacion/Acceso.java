package Encapsulacion;
/*Esta clase se va a encargar de contar los accesos al usuario, Implementada en Usuario.getNombre()*/
public class Acceso {
    private int intentos=0;

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
}
