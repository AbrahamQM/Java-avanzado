package Decorator;

public class TelefonoBasico implements Telefono{
    @Override
    public void crear() {
        System.out.println("Soy un teléfono Básico, tengo estas características: ");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println("  -> Básico:  Tengo GSM");
    }

    private void tengoSMS(){
        System.out.println("  -> Básico:  Tengo SMS");
    }
}
