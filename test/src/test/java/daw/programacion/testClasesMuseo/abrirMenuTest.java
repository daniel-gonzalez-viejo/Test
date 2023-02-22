package daw.programacion.testClasesMuseo;

import org.junit.jupiter.api.Test;

import daw.programacion.clasesMuseo.clasesMuseo.abrirMenu;
import daw.programacion.clasesMuseo.clasesMuseo.modificarObra;
import daw.programacion.clasesMuseo.clasesMuseo.obras;
import daw.programacion.clasesMuseo.clasesMuseo.obtenerPrecioDeVenta;
import daw.programacion.clasesMuseo.clasesMuseo.verObras;
import daw.programacion.clasesMuseo.clasesMuseo.visualizarDatos;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

public class abrirMenuTest {
    
    @Test
    public void testMenuOpciones() {
        String input = "foo\n1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        abrirMenu.main(new String[0]);
        String output = "Se ha producido un error en la inserción de comando\n" +
                "¿Qué quieres hacer?\n" +
                "-------------------------------------------------------------------------------------------------\n" +
                "[1] Ver cuadros\n" +
                "[2] Dar de alta\n" +
                "[3] Modificar los datos de una de las obras\n" +
                "[4] Visualizar los datos de una de las obras de arte expuestas\n" +
                "[5] Obtener el precio de venta de una de las obras de arte expuestas\n" +
                "[6] Imprimir una etiqueta para clasificar una de las obras expuestas y dar información adicional\n" +
                "[7] Salir\n" +
                "-------------------------------------------------------------------------------------------------\n" +
                "¿Qué quieres hacer?\n" +
                "-------------------------------------------------------------------------------------------------\n" +
                "[1] Ver cuadros\n" +
                "[2] Dar de alta\n" +
                "[3] Modificar los datos de una de las obras\n" +
                "[4] Visualizar los datos de una de las obras de arte expuestas\n" +
                "[5] Obtener el precio de venta de una de las obras de arte expuestas\n" +
                "[6] Imprimir una etiqueta para clasificar una de las obras expuestas y dar información adicional\n" +
                "[7] Salir\n" +
                "-------------------------------------------------------------------------------------------------\n";
        assertEquals(output, getClass());
    }
    

    @Test
    void testAgregarObra() {
        // Creamos un objeto verObras y agregamos una obra de prueba
        verObras galeria = new verObras(1);
        obras obra = new obras("001", "La Gioconda", "Leonardo da Vinci", "Renacimiento", 1503, 200000000, 0, null, null, 0, null);
        galeria.agregar(obra);
        // Comprobamos que la obra se agregó correctamente
        assertEquals(obra, galeria.buscar("001"));
    }

    @Test
    void testModificarObra() {
        // Creamos un objeto verObras y agregamos una obra de prueba
        verObras galeria = new verObras(1);
        obras obra = new obras("001", "La Gioconda", "Leonardo da Vinci", "Renacimiento", 1503, 200000000, 0, null, null, 0, null);
        galeria.agregar(obra);
        // Modificamos la obra de prueba
        modificarObra mod = new modificarObra();
        mod.setCódigo("001");
        mod.modificar(obra);
        // Comprobamos que la obra se modificó correctamente
        assertEquals("Renacimiento Tardío", obra.getTipo());
    }

    @Test
    void testVisualizarDatos() {
        // Creamos un objeto verObras y agregamos una obra de prueba
        verObras galeria = new verObras(1);
        obras obra = new obras("001", "La Gioconda", "Leonardo da Vinci", "Renacimiento", 1503, 200000000, 0, null, null, 0, null);
        galeria.agregar(obra);
        // Obtenemos los datos de la obra de prueba
        visualizarDatos vis = new visualizarDatos();
        vis.setCódigo("001");
        String datos = vis.mostrarDatos(obra);
        // Comprobamos que los datos obtenidos son los esperados
        assertEquals("Código: 001\nTítulo: La Gioconda\nArtista: Leonardo da Vinci\nEstilo: Renacimiento\nAño: 1503\nPrecio de venta: 200000000\n", datos);
    }

    @Test
    void testObtenerPrecioDeVenta() {
        // Creamos un objeto verObras y agregamos una obra de prueba
        verObras galeria = new verObras(1);
        obras obra = new obras("001", "La Gioconda", "Leonardo da Vinci", "Renacimiento", 1503, 200000000, 0, null, null, 0, null);
        galeria.agregar(obra);
        // Obtenemos el precio de venta de la obra de prueba
        obtenerPrecioDeVenta obt = new obtenerPrecioDeVenta();
        obt.setCódigo("001");
        String precio = obt.obtenerPrecio(obra);
        // Comprobamos que el precio obtenido es el esperado
        assertEquals("El precio de venta de La Gioconda es 200000000 euros", precio);
    }
}
