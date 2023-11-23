package Usuario;

public class Usuario {
    public String username;
    private String password;

    // Default
    // Public
    // Private
    // Protected
    public Usuario() {
        this.username = "";
        this.password = "";
    }

    public Usuario(String username) {
        this.username = username;
        this.password = "";
    }
    //metodo
    public void establecerRol() {
        Administrado admin = new Administrado();
        admin.trabajar();
    }
    //clase anidada
    public class Administrado {
        public void trabajar() {
            System.out.println("El administrador " +username+ " se encuentra trabajando!");
        }
    }

    // Constructor
    Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void saluda() {
        System.out.println("Hola, soy " + username);
    }
    // Getter
    public String getPassword() {
        return this.password;
    }
    // Setter
    public void setPassword(String password) {
        this.password = password;
    }

}
