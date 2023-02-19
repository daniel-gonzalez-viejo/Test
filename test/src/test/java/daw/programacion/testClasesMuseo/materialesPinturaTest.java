package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.materialesPintura;

public class materialesPinturaTest {
    @Test
    public void getOleo() {
        String oleo = materialesPintura.getOleo();
        assertEquals("Oleo", oleo);
    }

    @Test
    public void getAcuarela() {
        String acuarela = materialesPintura.getAcuarela();
        assertEquals("Acuarela", acuarela);
    }

    @Test
    public void getCarboncillo() {
        String carboncillo = materialesPintura.getCarboncillo();
        assertEquals("Carboncillo", carboncillo);
    }

    @Test
    public void getMateriales() {
        String[] materiales = materialesPintura.getMateriales();
        assertArrayEquals(new String[] {"Oleo", "Acuarela", "Carboncillo"}, materiales);
    }
        
}
