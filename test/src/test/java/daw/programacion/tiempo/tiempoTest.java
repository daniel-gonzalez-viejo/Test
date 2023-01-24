package daw.programacion.tiempo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class tiempoTest {

    @Test
    public void comprobarTiempo() throws IllegalAccessException {
        int horExpected = 21;
        int minExpected = 2;
        int secExpected = 33;
        
        ClaseTiempo tiem = new ClaseTiempo(horExpected, minExpected, secExpected){};

        tiem.setTime(horExpected, minExpected, secExpected);

        assertEquals(secExpected, tiem.getSecond());
        assertEquals(minExpected, tiem.getMinute());
        assertEquals(horExpected, tiem.getHour());
    }

    @Test
    public void ComprobarTiempoMásUno() throws IllegalAccessException {
        int horExpected = 0;
        int minExpected = 0;
        int secExpected = 0;

        int horMetida = 23;
        int minMetida = 59;
        int secMetido = 59;

        String tiempoExpected = horExpected + ":" + minExpected + ":" + secExpected;

        ClaseTiempo tiem = new ClaseTiempo(horMetida, minMetida, secMetido){};

        tiem.setTime(horMetida, minMetida, secMetido);

        assertEquals(tiempoExpected, tiem.nextSecond(horMetida, minMetida, secMetido));

    }

    @Test 
    public void ComprobarTiempoMenosUno() throws IllegalAccessException {
        int horExpected = 22;
        int minExpected = 58;
        int secExpected = 59;

        int horMetida = 22;
        int minMetida = 59;
        int secMetido = 0;

        String tiempoExpected = horExpected + ":" + minExpected + ":" + secExpected;

        ClaseTiempo tiem = new ClaseTiempo(horMetida, minMetida, secMetido){};

        tiem.setTime(horMetida, minMetida, secMetido);

        assertEquals(tiempoExpected, tiem.previousSecond(horMetida, minMetida, secMetido));
    }
    
}
