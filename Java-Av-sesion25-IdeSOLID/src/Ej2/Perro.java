package Ej2;

public class Perro implements Animal{
    @Override
    public void habla() {

    }

    //Este método rompería el principio I interface de SOLID porque constituye una función que un perro nunca va a usar
//    @Override
//    public void vuela() {
//    }

    @Override
    public void come() {

    }
}

//public class Pajaro implements Animal, AnimalVolador{
//    @Override
//    public void habla() {
//
//    }
//
//    @Override //Este si usaría el método vuela, así que implementará también la interfaz AnimalVolador
//    public void vuela() {
//    }
//
//    @Override
//    public void come() {
//
//    }
//}
