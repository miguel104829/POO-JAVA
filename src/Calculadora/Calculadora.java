package Calculadora;
public class Calculadora {
    // Enteros
    public int suma(int... numeros) {
        int suma = 0;
        for (int numero : numeros)
            suma += numero;
        return suma;
    }

       //Flotantes
    public float suma(float... numeros) {
        int suma = 0;
        for (float numero : numeros)
            suma += numero;
        return suma;

        //Doubles

}
    public double suma(double... numeros) {
        int suma = 0;
        for (double numero : numeros)
            suma += numero;
        return suma;
    }
}
