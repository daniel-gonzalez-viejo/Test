package daw.programacion.autores;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import daw.programacion.autores.libro.ClaseLibro;

public class autoresTest {

    @Test 
    public void mostrarNombreLibro(){
        String libroExpected = "Trenza del mar esmeralda";
        double precioExpected = 19.50;
        String autorExpected = "Sarandon Branderson";
        String emailExpected = "soisarandon@gmail.com";
        String genero = "m";

        ClaseAutores aut = new ClaseAutores(autorExpected, libroExpected, 0)

        ClaseLibro lib = new ClaseLibro(libroExpected, null, precioExpected, 0);

        assertEquals(7, null);
    }

}
