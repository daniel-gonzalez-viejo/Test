package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import daw.programacion.clasesMuseo.clasesMuseo.obras;
import daw.programacion.clasesMuseo.clasesMuseo.obtenerPrecioDeVenta;

public class obtenerPrecioDeVentaTest {

    final static String VERDE = "\u001B[32m";
    final static String BLANCO = "\u001B[37m";

    @Test
    public void testObtenerPrecio() {
        // Crear objeto de prueba
        obtenerPrecioDeVenta ob = new obtenerPrecioDeVenta();
        obras obra = new obras();
        obra.setNombre("El camino de los dioses");
        obra.setTipo("Pintura");
        obra.setAltura(3);
        obra.setPeso(4);
        obra.setPrecio(200);
        obra.setDescripción("fff");

        // Comparar la salida con el valor esperado
        String esperado = "------------------------------\n" + VERDE + "Nombre: " + BLANCO + "El camino de los dioses\n" + VERDE + "Altura: " + BLANCO + "3.0\n" + VERDE + "Peso: " + BLANCO + "4.0\n" + VERDE + "Precio: " 
        + BLANCO + "200.0\n" + VERDE + "Comisión de la galería: " + BLANCO + "50.0\n" 
                + VERDE + "Importe por peso (EUR): " + BLANCO + "100.0\n" + VERDE + "Importe por altura (EUR): " + BLANCO + "100.0\n" + VERDE +
                "Precio de venta (EUR): " + BLANCO + "450.0\n"+ VERDE +"Precio de venta (EUR): " + BLANCO + "445.5\n" + VERDE + "Descuento (10% Pintura EUR): " + BLANCO + "45.0\n" + VERDE + 
                "Precio de venta (EUR): " + BLANCO + "405.0\n";
        //assertEquals(esperado, ob.obtenerPrecio(obra));

        assertEquals(esperado, ob.obtenerPrecio(obra));
    }

}
