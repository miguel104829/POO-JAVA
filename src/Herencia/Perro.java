package Herencia;

public class Perro extends Mascota {


    @Override
    public void dormir() {
        super.dormir();//Super = Clase padre
        System.out.println("El perro duerme");
    }
}
