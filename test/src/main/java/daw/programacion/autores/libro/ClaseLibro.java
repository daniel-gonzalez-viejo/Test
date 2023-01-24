package daw.programacion.autores.libro;

import daw.programacion.autores.ClaseAutores;

public class ClaseLibro {
    private String nombreLibro;
    private ClaseAutores Autor;
    private double precio;
    private int cantidad;

    public ClaseLibro(String nombreLibro, ClaseAutores Autor, double precio, int cantidad){}

    public String getNombreLibro() {
        return nombreLibro;
    }

    public ClaseAutores getAutor() {
        return Autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ClaseLibro [nombreLibro=" + nombreLibro + ", Autor=" + Autor + ", precio=" + precio + ", cantidad="
                + cantidad + "]";
    };

    
}
