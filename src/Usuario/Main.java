package Usuario;

public class Main {
    public static void main(String[] args) {
/*Triangulo triangulo = new Triangulo();
        triangulo.base = 10;
        triangulo.altura = 20;

        float resultado = triangulo.area();
        System.out.println(resultado);*/
    Usuario usuario1 = new Usuario();
    Usuario usuario2 = new Usuario("Usuario2");


    Usuario codi = new Usuario("Codi", "1234");
    //codi.username = "Codi";
    //codi.password = "1234";
     //codi.setPassword("1234");

    System.out.println(codi.username);
    System.out.println(codi.getPassword());

    codi.saluda();
    usuario1.saluda();
    usuario2.saluda();
    codi.establecerRol();
    }
}