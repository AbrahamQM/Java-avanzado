package Mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediator{
    //Creamos una lista para guardar los elementos con los que interactuaremos
    ArrayList<Colega> colegas = new ArrayList<>();


    //Implementamos los método
    @Override
    void registra(Colega colega) {
        //Comprobamos que no duplicamos el elemento del array
        if (!colegas.contains(colega)){
            colegas.add(colega);
            colega.setMediator(this); //Le estamos diciendo que para ese colega, yo soy el mediadorConcreto
        }
    }

    @Override
    void reenvia(Colega colega) {
        for(Colega actual: colegas){
            if (!actual.equals(colega)) { //Comprobamos que no me envíe el mensaje a mi mismo en cada caso
                                            //Los que sean diferentes a mí RECIBIRÁN, pero el que envíe el mensaje NO
                actual.recibe();
            }
        }
    }
}
