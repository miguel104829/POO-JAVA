package Herencia;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();

        //gato.dormir();
        //perro.dormir();
        System.out.println(gato.getNombre());
        System.out.println(perro.getNombre());
    }
}
