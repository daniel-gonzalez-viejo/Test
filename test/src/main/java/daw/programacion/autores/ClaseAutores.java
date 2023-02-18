package daw.programacion.autores;

public class ClaseAutores {
    private String nombre = "";
    private String email = "";
    private char genero;

    public ClaseAutores(String nombre, String email, int i){}

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "ClaseAutores [nombre=" + nombre + ", email=" + email + ", genero=" + genero + "]";
    };

    
}
