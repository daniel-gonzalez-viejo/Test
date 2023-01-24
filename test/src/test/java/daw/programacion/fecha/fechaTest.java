package daw.programacion.fecha;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class fechaTest {
   
    @Test
    public void comprobarFecha() throws IllegalAccessException {
        int dayExpected = 30;
        int monthExpected = 4;
        int yearExpected = 3000;

        ClaseFecha fec = new ClaseFecha(dayExpected, monthExpected, yearExpected) {};

        fec.setDate(dayExpected, monthExpected, yearExpected);

        assertEquals(dayExpected, fec.getDay());
        assertEquals(monthExpected, fec.getMonth());
        assertEquals(yearExpected, fec.getYear());
    }

}
