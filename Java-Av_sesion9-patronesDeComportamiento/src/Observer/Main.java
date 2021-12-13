package Observer;

public class Main {
    public static void main(String[] args) {
        //Creamos emisora
        Emisora emisora = new Emisora();
        //Creamos receptores
        ReceptorTv tv = new ReceptorTv();
        ReceptorRadio radio = new ReceptorRadio();

        //Conectamos la emisora con los receptores añadiendo a la lista de receptores que tiene la emisora,
        //cada uno de los receptores que hemos creado.
        emisora.meteReceptor(tv);
        emisora.meteReceptor(radio);

        //Enviamos la señal con el método emite
        System.out.println("---------Primera emisión----------");
        emisora.emite();


        //añadimos otro receptor para comproar cómo se añade
        ReceptorSatelite sat = new ReceptorSatelite();
        emisora.meteReceptor(sat);

        //Emitimos de nuevo para comprobar
        System.out.println("----------Segunda emisión---------");
        emisora.emite();


    }
}
