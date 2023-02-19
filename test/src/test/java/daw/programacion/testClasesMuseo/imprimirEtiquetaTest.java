package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.obras;
import daw.programacion.clasesMuseo.clasesMuseo.imprimirEtiqueta;

public class imprimirEtiquetaTest {

    @Test
    public void imprimirUnaEtiqueta() {
        final String VERDE = "\u001B[32m";
        final String BLANCO = "\u001B[37m";
        imprimirEtiqueta imp = new imprimirEtiqueta();
        obras obras = new obras();
        obras.setNombre("La Gioconda");
        obras.setAutor("Leonardo da Vinci");
        obras.setDescripción("Famosa pintura renacentista");

        // Redirigimos la salida estándar a un stream en memoria para poder
        // comprobar lo que se ha impreso por pantalla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Llamamos al método que queremos probar
        imp.imprimirUnaEtiqueta(obras);

        // Comprobamos que se ha impreso la etiqueta con los datos correctos
        String etiquetaEsperada = VERDE + "Nombre:" + BLANCO + " La Gioconda\n" + VERDE + "Autor: " + BLANCO + "Leonardo da Vinci\n" + VERDE + "Descripción: " + BLANCO + "Famosa pintura renacentista\n";
        assertEquals(etiquetaEsperada, outputStream.toString());
    }
}
