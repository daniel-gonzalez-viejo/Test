package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.materialesEscultura;

public class materialesEsculturaTest {
    @Test
    public void getAcero() {
        String acero = materialesEscultura.getAcero();
        assertEquals("Acero", acero);
    }

    @Test
    public void getCobre() {
        String cobre = materialesEscultura.getCobre();
        assertEquals("Cobre", cobre);
    }

    @Test
    public void getHierro() {
        String hierro = materialesEscultura.getHierro();
        assertEquals("Hierro", hierro);
    }

    @Test
    public void getMateriales() {
        String[] materiales = materialesEscultura.getMateriales();
        assertArrayEquals(new String[] {"Acero", "Cobre", "Hierro"}, materiales);
    }
        
}