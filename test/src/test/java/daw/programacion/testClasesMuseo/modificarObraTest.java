package daw.programacion.testClasesMuseo;

import daw.programacion.clasesMuseo.clasesMuseo.modificarObra;
import daw.programacion.clasesMuseo.clasesMuseo.obras;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class modificarObraTest {
    final static String CYAN = "\u001B[36m";
    final static String BLANCO = "\u001B[37m";

    @Test
    public void setAndGetCodigo() {
        modificarObra.setCódigo("1");
        assertEquals("1", modificarObra.getCódigo());
    }

    @Test
    public void testPedirObra() {
        obras obra = new obras();
        ByteArrayInputStream inContent = new ByteArrayInputStream("1\n".getBytes());
        System.setIn(inContent);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        modificarObra.pedirObra();
        assertEquals(CYAN + "¿Qué obra quieres visualizar?: " + BLANCO + "\n", outContent.toString());
        assertEquals("A001", modificarObra.getCódigo());
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
        modificarObra.modificar(obra);
        assertEquals("Escultura", obra.getTipo());
        assertEquals("El Pensador", obra.getNombre());
        assertEquals("Auguste Rodin", obra.getAutor());
        assertEquals(5000000.00, obra.getPrecio(), 0.01);
        assertEquals(200, obra.getAltura());
        assertEquals(500, obra.getPeso());
        assertEquals("Mármol", obra.getMaterial());
        assertEquals("Cincel", obra.getTécnica());
        assertEquals(1, obra.getPiezas());
        assertEquals("Un hombre pensando", obra.getDescripción());
    }
    
}
