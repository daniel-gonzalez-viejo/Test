package daw.programacion.rectangulo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class rectanguloTest {

    @Test
    public void devolverMedidas() {
        float expected = 1.4f;
        float expected2 = 3.5f;

        ClaseRectangulo rec = new ClaseRectangulo();
        rec.setWidth(expected2);
        rec.setLength(expected);
        assertEquals(expected, rec.getLength());
        assertEquals(expected2, rec.getWidth());

        System.out.println(rec.toString());
    }

    @Test
    public void devolverArea() {
        float expected = 9.18f;

        ClaseRectangulo rec = new ClaseRectangulo();
        assertEquals(expected, rec.getArea(), 0.1);
    }
    
    @Test
    public void devolverPerimetro() {
        float expected = 12f;

        ClaseRectangulo rec = new ClaseRectangulo();
        assertEquals(expected, rec.getPerimetro(), 0.3);
    } 
}
