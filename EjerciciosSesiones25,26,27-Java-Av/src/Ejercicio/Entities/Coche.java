package Ejercicio.Entities;

public class Coche {
    private String tipo;
    private String modelo;
    private String marca;
    private String matricula;
    private int añoMatriculacion;
    private boolean estaArrancado = false;

    public String getModelo() {
        return modelo;
    }

    public Coche setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Coche setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getMatricula() {
        return matricula;
    }

    public Coche setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public int getAñoMatriculacion() {
        return añoMatriculacion;
    }

    public Coche setAñoMatriculacion(int añoMatriculacion) {
        this.añoMatriculacion = añoMatriculacion;
        return this;
    }

    public boolean getEstaArrancado() {
        return estaArrancado;
    }

    public Coche setEstaArrancado(boolean estaArrancado) {
        this.estaArrancado = estaArrancado;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Coche setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }
}

