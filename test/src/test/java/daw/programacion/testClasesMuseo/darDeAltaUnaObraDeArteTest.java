package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.darDeAltaUnaObraDeArte;
import daw.programacion.clasesMuseo.clasesMuseo.obras;

public class darDeAltaUnaObraDeArteTest {

    @Test
    public void testNuevaObra() {
        darDeAltaUnaObraDeArte alta = new darDeAltaUnaObraDeArte();

        obras esperada = new obras("6", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        alta.darDeAlta();
        obras actual = alta.nuevaObra();

        assertEquals(esperada.getID(), actual.getID());
        assertEquals(esperada.getTipo(), actual.getTipo());
        assertEquals(esperada.getNombre(), actual.getNombre());
        assertEquals(esperada.getAutor(), actual.getAutor());
        assertEquals(esperada.getPrecio(), actual.getPrecio(), 0.001);
        assertEquals(esperada.getAltura(), actual.getAltura(), 0.001);
        assertEquals(esperada.getPeso(), actual.getPeso(), 0.001);
        assertEquals(esperada.getMaterial(), actual.getMaterial());
        assertEquals(esperada.getTécnica(), actual.getTécnica());
        assertEquals(esperada.getPiezas(), actual.getPiezas());
        assertEquals(esperada.getDescripción(), actual.getDescripción());
    }
}
