package Encapsulacion;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepe");
        usuario.setAltura(173);
        usuario.setEdad(15);

        System.out.println("-Nombre: "+usuario.getNombre() + " -Edad: " + usuario.getEdad());

        usuario.getNombre();
        usuario.getNombre();
        System.out.println("Nº de accesos al nombre del usuario: " + usuario.getNombre()
                + " ="+usuario.getAccesos().getIntentos());
    }
}
