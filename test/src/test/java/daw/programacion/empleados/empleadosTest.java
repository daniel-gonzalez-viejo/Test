package daw.programacion.empleados;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class empleadosTest {
    
    @Test
    public void devolverSalario(){
        int id_expected = 0;
        int expected = 1000;

        ClaseEmpleados emp = new ClaseEmpleados(id_expected, null, null, expected);
        emp.setSalario(1000);

        assertEquals(id_expected, emp.getId());
        assertEquals(expected, emp.getSalario());
    }

    @Test
    public void devolverSalarioConAumento(){
        int id_expected = 0;
        int expected = 1100;
        
        ClaseEmpleados emp = new ClaseEmpleados(id_expected, null, null, expected);
        emp.setSalario(1000);
        int incremento = 10;
        int salarioAumentado = emp.aumentarSalario(emp.getSalario(), incremento);
        
        
        assertEquals(expected, salarioAumentado);

    } 

    @Test
    public void devolverNombreCompleto() {

        ClaseEmpleados emp = new ClaseEmpleados(0, null, null, 0);

        String nombreExpected = "Paco";
        String apellidosExpected = "González";

        assertEquals("El nombre es " + nombreExpected + " " + apellidosExpected, emp.getNombreCompleto(nombreExpected, apellidosExpected));
    }

    @Test
    public void devolverSalarioAnual() {

        int expected = 13248;

        ClaseEmpleados emp = new ClaseEmpleados(0, null, null, 0);

        emp.setSalario(1104);
        assertEquals(expected, emp.getSalarioAnual(emp.getSalario()));
    }

}
