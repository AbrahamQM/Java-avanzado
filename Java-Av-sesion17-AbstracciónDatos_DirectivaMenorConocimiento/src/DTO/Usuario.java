package DTO;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    private Usuario(){}//constructor vacío PRIVATE:para que no se puedan construir usuarios sin datos

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public String obtenerUsuario(){
        return nombre;
    }

    public void añadirVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
}
