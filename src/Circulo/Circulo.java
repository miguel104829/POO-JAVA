package Circulo;

public class Circulo {
    public static float pi = 3.1416f;
    public float radio = 0.0f;

    public Circulo(float radio) {
        this.radio = radio;
    }
    public static float area(float radio) {
        return pi * radio * radio;
    }
}
