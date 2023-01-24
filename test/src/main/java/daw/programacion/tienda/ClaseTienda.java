package daw.programacion.tienda;

public class ClaseTienda {
    private String id = "1";
    private String descripción = "Es un libro de Sarandon Branderson";
    private int cantidad;
    private double precioUnidad;

    public ClaseTienda(String id, String descripción, int cantidad,
    double precioUnidad) {
        id = "1";
        descripción = "Es un libro de Sarandon Branderson";
        cantidad = 0;
        precioUnidad = 0.0;
    }

    public String getId() {
        return id;
    }

    public String getDescripción() {
        return descripción;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public double getTotal() {
        return cantidad*precioUnidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "ClaseTienda [id=" + id + ", descripción=" + descripción + ", cantidad=" + cantidad + ", precioUnidad="
                + precioUnidad + "]";
    }

    

}
