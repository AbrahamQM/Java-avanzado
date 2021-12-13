package Decorator;

public class Main {
    public static void main(String[] args) {
        TelefonoBasico telefonoBasico= new TelefonoBasico(); //Comentar para ver como se produce el envoltorio
        System.out.println("---telefonoBasico:");
        telefonoBasico.crear(); //Comentar para ver como se produce el envoltorio

        TelefonoInteligente ti=new TelefonoInteligente(new TelefonoBasico()); //Instanciamos un TeléfonoInteligente que va a
        // decorar un nuevo teléfono básico
        System.out.println("---ti:");
        ti.crear(); //Usamos la función crear

        //Combinamos decoradores
        TelefonoNextGen telCompleto = new TelefonoNextGen(  //Instanciamos un TeléfonoNextGen que va a decorar un
                new TelefonoInteligente( // nuevo teléfonoInteligente que decorará un
                        new TelefonoBasico() //nuevo teléfonoBásico
                )
        );
        System.out.println("---telCompleto:");
        telCompleto.crear();//Creamos el teléfono (telCompleto) que mejorará un teléfonoInteligente que mejorará un teléfonoBásico

        //Ahora voy a decorar telefonoBasico "Creado al Principio" diciendole que es nextGen
        TelefonoNextGen tngV1 = new TelefonoNextGen(telefonoBasico); //tngV1 va a ser un teéfono básico al que le
        // añadimos las características de un TeléfonoNextGen
        System.out.println("---tngV1:");
        tngV1.crear(); //Creamos el tngV1

        //Ahora creo tngV2 que será tngV1 + las características del teléfonoInteligente (será idéntico a telCompleto)
        TelefonoInteligente tngV2 = new TelefonoInteligente(tngV1);
        System.out.println("---tngV2(tngV1 + TeléfonoInteligente):");
        tngV2.crear(); //hacemos que se ejecute el método
    }
}
