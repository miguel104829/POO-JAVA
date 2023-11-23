package ClasesAbstractas;

public class Main {
    public static void main(String[] args) {
      Figura figuras[] = new Figura[2];

      Figura circulo = new Circulo(9f);
      Figura triangulo = new Triangulo(5f, 4f);

      figuras[0] = circulo;
      figuras[1] = triangulo;

      System.out.println(figuras[0].area());
      System.out.println(figuras[1].area());
    }
}
