package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        verObras aa = new verObras(2);
        obras obra1 = new obras("001", "La Mona Lisa", "Leonardo da Vinci", null, 0, 0, 0, null, null, 0, null);
        obras obra2 = new obras("001", "La Mona Lisa", "Leonardo da Vinci", null, 0, 0, 0, null, null, 0, null);
        verObras.aumentarTamaño(obra1);
        verObras.aumentarTamaño(obra2);
        obras OBRAS[] = {obra1,obra2};
        assertEquals(2, OBRAS.length);
    }

    @Test
    public void agregar() {
        verObras aa = new verObras(2);

        assertEquals(true, aa.agregar(aa));

    }

    @Test
    public void buscar() {
        verObras aa = new verObras(2);

        assertEquals(null, aa.buscar("1"));

    }

    @Test
    public void toStrin() {
        verObras aa = new verObras(2);
        obras obra1 = new obras("", null, null, null, 0, 0, 0, null, null, 0, null);

        String s = obra1.getID();
        assertEquals(s, aa.toStrin());

    }
}
