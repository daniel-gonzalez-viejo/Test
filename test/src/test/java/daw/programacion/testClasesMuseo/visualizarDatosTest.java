package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import daw.programacion.clasesMuseo.clasesMuseo.visualizarDatos;
import daw.programacion.clasesMuseo.clasesMuseo.obras;

public class visualizarDatosTest {

    @Test
    public void visualizarDatosTest() {
        obras ob = new obras();
        visualizarDatos v = new visualizarDatos();
        v.mostrarDatos(ob);
        assertEquals(ob.getNombre(), v.getNombre());
    }
}
