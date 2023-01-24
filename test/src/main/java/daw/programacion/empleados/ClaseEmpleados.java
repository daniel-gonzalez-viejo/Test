package daw.programacion.empleados;

public class ClaseEmpleados {
    private int id;
    private String Nombre;
    private String Apellidos;
    private int Salario;

    public ClaseEmpleados(int id, String Nombre, String Apellidos, int Salario) {
        id = 0;
        Nombre = "None";
        Apellidos = "Nones";
        Salario = 0;
        }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getNombreCompleto(String Nombre, String Apellidos) {
        return "El nombre es " + Nombre + " " + Apellidos;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    public int getSalarioAnual(int salario) {
        return salario * 12;
    }

    public int aumentarSalario(int salario, int porcentaje) {
        return salario + (salario * 10 / 100);
    }

    @Override
    public String toString() {
        return "ClaseEmpleados [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Salario=" + Salario
                + "]";
    }

    

    

}
