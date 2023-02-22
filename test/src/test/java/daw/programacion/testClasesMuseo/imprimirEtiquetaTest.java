package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.obras;
import daw.programacion.clasesMuseo.clasesMuseo.imprimirEtiqueta;

public class imprimirEtiquetaTest {

    @Test
    public void imprimirUnaEtiqueta() {
        final String VERDE = "\u001B[32m";
        final String BLANCO = "\u001B[37m";

        imprimirEtiqueta imp = new imprimirEtiqueta();
        obras obra1= new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 0, 0, 0, BLANCO, VERDE, 0, "Famosa pintura renacentista");


        // Llamamos al método que queremos probar
        imp.imprimirUnaEtiqueta(obra1);

        // Comprobamos que se ha impreso la etiqueta con los datos correctos
        String etiquetaEsperada = VERDE + "Nombre: " + BLANCO + "La Gioconda\n" + VERDE + "Autor: " + BLANCO + "Leonardo da Vinci" + VERDE + "Descripción: " + BLANCO + "Famosa pintura renacentista";
        assertEquals(etiquetaEsperada, imp.imprimirUnaEtiqueta(obra1));
    }
}
