package ClasesAbstractas;

public class Circulo extends Figura{
    public static float pi = 3.1416f;
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        return Circulo.pi * (this.radio * this.radio);
    }
}
