package daw.programacion.circulo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class circuloTest {
    
    @Test
    public void devolverRadio(){
        double expected = 1.0;
        ClaseCirculo cir = new ClaseCirculo();
        //cir.setRadio(3.0);
        assertEquals(expected, cir.getRadio());
    }

    @Test
    public void devolverArea(){
        double expected = 3.14;
        ClaseCirculo cir = new ClaseCirculo();
        assertEquals(expected, cir.getArea(), 0.01);
    }

    @Test
    public void devolverCircunferencia(){
        double expected = 6.28;
        ClaseCirculo cir = new ClaseCirculo();
        assertEquals(expected, cir.radio*Math.PI*2, 0.1);
    }

}
