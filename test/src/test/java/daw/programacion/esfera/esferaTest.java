package daw.programacion.esfera;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class esferaTest {

    @Test
    public void comprobarMedidas() {
        float xExpected = 7;
        float yExpected = 4;
        int radioExpected = 7;

        ClaseEsfera esf = new ClaseEsfera(xExpected, yExpected, radioExpected, 0, 0);

        esf.setX(xExpected);
        esf.setY(yExpected);
        esf.setRadio(radioExpected);

        assertEquals(xExpected, esf.getX());
        assertEquals(yExpected, esf.getY());
    }
    
    @Test
    public void comprobarMovimiento() {
        float xExpected = 7;
        float yExpected = 4;
        float xDeltaIntroducido = 8;
        float xDeltaExpected = xExpected + xDeltaIntroducido;
        float yDeltaIntroducido = 7;
        float yDeltaExpected = yExpected + yDeltaIntroducido;

        ClaseEsfera esf = new ClaseEsfera(xExpected, yExpected, 0, xDeltaExpected, yDeltaExpected);

        esf.setX(xExpected);
        esf.setY(yExpected);
        esf.setDeltaX(xDeltaIntroducido);
        esf.setDeltaY(yDeltaIntroducido);

        esf.move();

        assertEquals(xDeltaExpected, esf.getX());
        assertEquals(yDeltaExpected, esf.getY());

    }

    @Test
    public void comprobarReflejos() {
        float xDeltaExpected = 12;
        float yDeltaExpected = 5;

        ClaseEsfera esf = new ClaseEsfera(0, 0, 0, xDeltaExpected, yDeltaExpected);

        esf.setDeltaX(-xDeltaExpected);
        esf.setDeltaY(-yDeltaExpected);
        esf.reflejoHorizontal();
        esf.reflejoVertical();

        assertEquals(xDeltaExpected, esf.getDeltaX());
        assertEquals(yDeltaExpected, esf.getDeltaY());
    }

    @Test
    public void comprobarVelocidad() {
        float xExpected = 7;
        float yExpected = 4;
        float xDeltaIntroducido = 8;
        float xDeltaExpected = xExpected + xDeltaIntroducido;
        float yDeltaIntroducido = 7;
        float yDeltaExpected = yExpected + yDeltaIntroducido;


        ClaseEsfera esf = new ClaseEsfera(xExpected, yExpected, 0, xDeltaExpected, yDeltaExpected);

        esf.setX(xExpected);
        esf.setY(yExpected);
        esf.setDeltaX(xDeltaExpected);
        esf.setDeltaY(yDeltaExpected);

        //esf.move();

        String VelocidadExpected = "Esfera [" + xExpected + "," + yExpected + "] Velocidad ["+ xDeltaExpected + "," + yDeltaExpected + "]";

        assertEquals(VelocidadExpected, esf.toString());
    }
}
