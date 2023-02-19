package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        ob.setNombre("El camino de los dioses");
        ob.setTipo("Pintura");
        ob.setAltura(3);
        ob.setPeso(4);
        ob.setPrecio(200);

        // Capturar la salida del método en una variable
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        ob.obtenerPrecio(obra);
        String actual = baos.toString();

        // Comparar la salida con el valor esperado
        String esperado = "" + "\n------------------------------\n" + VERDE + "Nombre: " + BLANCO + "El camino de los dioses\n" + VERDE + "Altura: " + BLANCO + "3.0\n" + VERDE + "Peso: " + BLANCO + "4.0\n" + VERDE + "Precio: " 
        + BLANCO + "200.0\n" + VERDE + "Comisión de la galería: " + BLANCO + "50.0\n" 
                + VERDE + "Importe por peso (EUR): " + BLANCO + "100.0\n" + VERDE + "Importe por altura (EUR): " + BLANCO + "100.0\n" + VERDE + "Importe adicional - Pieza 3 (EUR):" + BLANCO + "10\n" + VERDE +
                "Importe adicional - Pieza 4 (EUR):" + BLANCO + "10\n" + VERDE + "Importe adicional - Pieza 5 (EUR):" + BLANCO + "10\n" + VERDE +
                "Precio de venta (EUR): " + BLANCO + "480.0\n"+ VERDE +"Precio de venta (USD): " + BLANCO + "475.2\n" + VERDE + "Descuento (10% Pintura EUR): " + BLANCO + "48.0\n" + VERDE + 
                "Precio de venta (EUR): " + BLANCO + "432.0\n\n";
        assertEquals(esperado, actual);
    }

}
