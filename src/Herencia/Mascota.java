package Herencia;

public class Mascota {
    public String nombre;
    public String raza;
    public int edad;

    public Mascota() {
    }
    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public void dormir() {
        System.out.println("la mascota duerme");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
         this.edad = edad;
    }
}
