package Ejercicio.Repositories;

import Ejercicio.EntitiesInterfaces.CochesCompletos;

import java.util.ArrayList;

public interface CochesDB {
    ArrayList<CochesCompletos> obtener();
    CochesCompletos buscar(CochesCompletos coche);
    void insertar(CochesCompletos coche);
    void borrar(CochesCompletos coche);
    void actualizarCoche(CochesCompletos coche);
}
