package daw.programacion.testClasesMuseo;

import org.junit.jupiter.api.Test;

import daw.programacion.clasesMuseo.clasesMuseo.abrirMenu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

public class abrirMenuTest {
    
    @Test
    public void abrirMenuTest(){
        abrirMenu ab = new abrirMenu();

        ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());

        assertEquals("s", ab);

    }
}
