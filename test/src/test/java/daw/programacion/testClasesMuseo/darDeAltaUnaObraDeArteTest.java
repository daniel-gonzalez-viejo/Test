package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.obras;

public class darDeAltaUnaObraDeArteTest {

    @Test
    public void darDeAlta() {
        // Crear un objeto de la clase Obras
        obras obra = new obras();
    
        // Simular la entrada de teclado del usuario utilizando Scanner
        ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());
        System.setIn(inputStream);
        obra.setID("1");
        obra.setTipo("Pintura");
        obra.setNombre("La Gioconda");
        obra.setAutor("Leonardo da Vinci");
        obra.setPrecio(1000.0);
        obra.setAltura(80.0);
        obra.setPeso(10.0);
        obra.setTécnica("Oleo");
        obra.setMaterial("");
        obra.setPiezas(1);
        obra.setDescripción("Retrato de Lisa Gherardini");

    
        
    
        // Comprobar que la obra se ha creado correctamente
        assertEquals("1", obra.getID());
        assertEquals("Pintura", obra.getTipo());
        assertEquals("La Gioconda", obra.getNombre());
        assertEquals("Leonardo da Vinci", obra.getAutor());
        assertEquals(1000.0, obra.getPrecio(), 0.001);
        assertEquals(80.0, obra.getAltura(), 0.001);
        assertEquals(10.0, obra.getPeso(), 0.001);
        assertEquals("", obra.getMaterial());
        assertEquals("Oleo", obra.getTécnica());
        assertEquals(1, obra.getPiezas());
        assertEquals("Retrato de Lisa Gherardini", obra.getDescripción());
    }
}