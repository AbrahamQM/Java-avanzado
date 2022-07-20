package DirectivaMenorConocimiento;

import java.util.ArrayList;

public class Usuarios {
    private int contador;

    public void miMetodo(int contador){ //2º
        ArrayList<Integer> lista = new ArrayList<>();//3º
        this.contador = contador; //1º
        lista.add(contador);//3º

        //Esto no estaría permitido con la ley de Demeter:
        //objeto cosa = new cosa();
        //cosa.getvalores().getElementos.getSuperficiales();
        //Esto si estaría permitido:
        //objeto cosa = new cosa();
        //cosa.valores.elementos.superficiales; //Porque accedemos a propiedades del objeto
    }


}
