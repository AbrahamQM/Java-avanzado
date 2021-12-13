package Observer;

import java.util.ArrayList;

public class Emisora {
    //Creamos una lista de receptores PRIVADA
    private ArrayList<Receptor> receptores = new ArrayList<>();

    //método para añadir receptores
    public void meteReceptor(Receptor receptor){
        receptores.add(receptor);
    }

    //Emisión a todos los receptores
    public void emite(){
        for (Receptor receptor: receptores){
            receptor.recibe();
        }
    }

}
