package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.verObras;
import daw.programacion.clasesMuseo.clasesMuseo.obras;

public class verObrasTest {
    
    @Test
    public void verObras() {
        obras obras = new obras(null, null, null, null, 5, 5, 5, null, null, 0, null);
        obras obras2 = new obras(null, null, null, null, 5, 5, 5, null, null, 0, null);
        obras obras3 = new obras(null, null, null, null, 5, 5, 5, null, null, 0, null);
        obras obras4 = new obras(null, null, null, null, 5, 5, 5, null, null, 0, null);
        obras obras5 = new obras(null, null, null, null, 5, 5, 5, null, null, 0, null);
        obras OBRAS[] = {obras,obras2,obras3,obras4,obras5};

        assertEquals(5, OBRAS.length);
    }

    @Test
    public void aumentarTamaño() {
        obras obras = new obras(null, null, null, null, 5, 0, 0, null, null, 0, null);
        verObras ver = new verObras(5);

        assertEquals(obras, ver.aumentarTamaño(obras));
    }

    @Test
    public void agregar() {
        obras obras = new obras(null, null, null, null, 5, 0, 0, null, null, 0, null);
        verObras ver = new verObras(2);

        assertTrue(ver.agregar(obras));
    }

    @Test
    public void testBuscar() {
        obras obras = new obras(null, null, null, null, 5, 0, 0, null, null, 0, null);
        obras obra1 = new obras("6", "La Gioconda", null, null, 0, 0, 0, null, null, 0, null);

        String expected = String.valueOf(obras.getOBRAS_INICIALES().length + 1);

        // buscar obra existente
        assertEquals(expected, obra1.insertarID());

    }

    @Test
    public void toStrin() {
        verObras aa = new verObras(3);
        obras obra1 = new obras("5", "ddd", "dddd", "ddd", 3, 2, 4, "tgff", "dfggh", 3, "dtyuytr");
        aa.agregar(obra1);

        String s = obra1.toString();
        assertEquals(s, aa.toStrin());

    }
}
