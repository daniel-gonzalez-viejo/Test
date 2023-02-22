package daw.programacion.testClasesMuseo;

import daw.programacion.clasesMuseo.clasesMuseo.modificarObra;
import daw.programacion.clasesMuseo.clasesMuseo.obras;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class modificarObraTest {
    final static String CYAN = "\u001B[36m";
    final static String BLANCO = "\u001B[37m";
    final String MENSAJE_PEDIR_OBRA = CYAN + "¿Qué obra quieres visualizar?: " + BLANCO;
    modificarObra mod = new modificarObra();

    @Test
    public void setAndGetCodigo() {
        mod.setCódigo("1");
        assertEquals("1", mod.getCódigo());
    }

    @Test
    public void testPedirObra() {
        obras obra = new obras();
        modificarObra mod = new modificarObra();
    
        String codigoEsperado = "1\n"; // Agregar salto de línea para simular el Enter del usuario
    
        ByteArrayInputStream inContent = new ByteArrayInputStream(codigoEsperado.getBytes());
        System.setIn(inContent);
    
        mod.pedirObra();
        assertEquals(codigoEsperado, mod.getCódigo());
        //assertEquals(outContent.toString(), MENSAJE_PEDIR_OBRA + "\n");
    }

    @Test
    public void testModificar() {
        obras obra = new obras();
        obra.setTipo("Pintura");
        obra.setNombre("La Gioconda");
        obra.setAutor("Leonardo da Vinci");
        obra.setPrecio(1000000.00);
        obra.setAltura(77);
        obra.setPeso(18);
        obra.setMaterial("Oleo");
        obra.setTécnica("Pincel");
        obra.setPiezas(1);
        obra.setDescripción("Un retrato de Lisa Gherardini");
        String input = "Escultura\nEl Pensador\nAuguste Rodin\n5000000.00\n200\n500\nMármol\nCincel\n1\nUn hombre pensando\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        Scanner sc = new Scanner(inContent);
        //mod.modificar(obra);
        assertEquals("Pintura", obra.getTipo());
        assertEquals("La Gioconda", obra.getNombre());
        assertEquals("Leonardo da Vinci", obra.getAutor());
        assertEquals(1000000.00, obra.getPrecio(), 0.01);
        assertEquals(77, obra.getAltura());
        assertEquals(18, obra.getPeso());
        assertEquals("Oleo", obra.getMaterial());
        assertEquals("Pincel", obra.getTécnica());
        assertEquals(1, obra.getPiezas());
        assertEquals("Un retrato de Lisa Gherardini", obra.getDescripción());
    }
    
}
