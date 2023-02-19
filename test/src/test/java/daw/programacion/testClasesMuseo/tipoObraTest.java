package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.tipoObra;

public class tipoObraTest {
    @Test
    public void getPintura() {
        String pintura = tipoObra.getPintura();
        assertEquals("Pintura", pintura);
    }

    @Test
    public void getEscultura() {
        String escultura = tipoObra.getEscultura();
        assertEquals("Escultura", escultura);
    }

    @Test
    public void getTipos() {
        String[] tipo = tipoObra.getTipos();
        assertArrayEquals(new String[] {"Pintura", "Escultura"}, tipo);
    }
    
}
