package com.OB.demoSpringRest.models;

//POJO: Plain Old Java Objet ----modelo de datos
public class Bootcamper {
    //Atributos
    private String nombre;
    private double valor;

    //Constructores
    public Bootcamper() {} //Vacío

    public Bootcamper(String nombre, double valor) { this.nombre = nombre; this.valor = valor;} //Con Parámetro

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
