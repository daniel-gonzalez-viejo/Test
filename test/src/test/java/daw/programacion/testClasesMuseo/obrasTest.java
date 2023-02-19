package daw.programacion.testClasesMuseo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import daw.programacion.clasesMuseo.clasesMuseo.materialesEscultura;
import daw.programacion.clasesMuseo.clasesMuseo.materialesPintura;
import daw.programacion.clasesMuseo.clasesMuseo.obras;
import daw.programacion.clasesMuseo.clasesMuseo.tipoObra;

public class obrasTest {

    @Test
    public void setID_GetID() {
        obras obra = new obras();
        String id = "1";
        obra.setID(id);
        assertEquals(id, obra.getID());
    }
    
    @Test
    public void insertarID() {
        // Creamos un arreglo de obras de arte para usar en el test
        obras[] obras = new obras[6];
        obras[0] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[1] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[2] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[3] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[4] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[5] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");

        // Creamos una nueva obra de arte y llamamos al método insertarID()
        obras nuevaObra = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        nuevaObra.insertarID();

        // Verificamos que el ID de la nueva obra sea "3", que es el siguiente número después de OBRAS_INICIALES.length
        assertEquals("6", nuevaObra.getID());
    }

    @Test
    public void noInsertarID() {
        // Creamos un arreglo de obras de arte para usar en el test
        obras[] obras = new obras[6];
        obras[0] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[1] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[2] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[3] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        obras[4] = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");

        // Creamos una nueva obra de arte y llamamos al método insertarID()
        obras nuevaObra = new obras("1", "Pintura", "La Gioconda", "Leonardo da Vinci", 1000000, 77, 18, "Óleo sobre tabla", "Pincel", 1, "Retrato de Lisa Gherardini");
        nuevaObra.insertarID();

        // Verificamos que el ID de la nueva obra sea "3", que es el siguiente número después de OBRAS_INICIALES.length
        assertNotEquals("5", nuevaObra.getID());
    }

    @Test
    void setTipo_GetTipo() {
        obras obras = new obras();
        String tipo = tipoObra.getPintura();
        obras.setTipo(tipo);
        assertEquals(tipo, obras.getTipo());
    }

    @Test
    public void insertarTipoPintura() {

        // Creamos una instancia de la clase que tiene la propiedad Tipo
        obras obras = new obras();

        String expected = "Pintura";
        obras.setTipo(expected);

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals(obras.getTipo(), obras.insertarTipo("Error: El tipo de obra ingresado no es válido."));
    }

    @Test
    public void insertarTipoEscultura() {

        // Creamos una instancia de la clase que tiene la propiedad Tipo
        obras obras = new obras();

        String expected = "Escultura";
        obras.setTipo(expected);

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals(obras.getTipo(), obras.insertarTipo("Error: El tipo de obra ingresado no es válido."));
    }

    @Test
    public void noInsertarTipo() {

        // Creamos una instancia de la clase que tiene la propiedad Tipo
        obras obras = new obras();

        String expected = "Pintura";
        obras.setTipo(expected);
        String not_expected = "Escultura";

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertNotEquals(not_expected, obras.insertarTipo("Error: El tipo de obra ingresado no es válido."));

        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertNotEquals("", obras.insertarTipo("Error: El tipo de obra ingresado no es válido."));
    }

    @Test
    void setNombre_GetNombre() {
        obras obras = new obras();
        String nombre = "Dani";
        obras.setNombre(nombre);
        assertEquals(nombre, obras.getNombre());
    }

    @Test
    public void insertarNombre() {

        // Creamos una instancia de la clase que tiene la propiedad Tipo
        obras obras = new obras();

        String expected = "Dani";
        obras.setNombre(expected);

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals(obras.getNombre(), obras.insertarNombre());
    }

    @Test
    void setAutor_GetAutor() {
        obras obras = new obras();
        String autor = obras.getAutor();
        obras.setAutor(autor);
        assertEquals(autor, obras.getAutor());
    }

    @Test
    public void insertarAutor() {

        // Creamos una instancia de la clase que tiene la propiedad Tipo
        obras obras = new obras();

        String expected = "Da Vinci";
        obras.setAutor(expected);

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals(obras.getAutor(), obras.insertarAutor());
    }

    @Test
    void setPrecio_GetPrecio() {
        obras obras = new obras();
        double precio = 4000;
        obras.setPrecio(precio);
        assertEquals(precio, obras.getPrecio());
    }

    @Test
    public void insertarPrecio() {

        obras obras = new obras();

        String expected = "1234.0";
        obras.setPrecio(Double.parseDouble(expected));

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));

        assertEquals(1234.0, obras.insertarAltura(), 0.1);
    }

    @Test
    void setAltura_GetAltura() {
        obras obras = new obras();
        double altura = 4;
        obras.setAltura(altura);
        assertEquals(altura, obras.getAltura());
    }

    @Test
    public void insertarAltura() {

        obras obras = new obras();

        String expected = "4";
        obras.setAltura(Double.parseDouble(expected));

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));

        assertEquals(4, obras.insertarPrecio(), 0.1);
    }

    @Test
    void setPeso_GetPeso() {
        obras obras = new obras();
        double Peso = 4;
        obras.setPeso(Peso);
        assertEquals(Peso, obras.getPeso());
    }

    @Test
    public void insertarPeso() {

        obras obras = new obras();

        String expected = "4";
        obras.setPeso(Double.parseDouble(expected));

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));

        assertEquals(4, obras.insertarPeso(), 0.1);
    }

    @Test
    void setMaterial_GetMaterial() {
        obras obras = new obras();
        String Material = materialesEscultura.getAcero();
        obras.setMaterial(Material);
        assertEquals(Material, obras.getMaterial());
    }

    @Test
    public void insertarMaterial() {

        // Creamos una instancia de la clase que tiene la propiedad Material
        obras obras = new obras();

        String expected = "Acero";
        insertarTipoEscultura();
        obras.setMaterial(expected);

        // Prueba 1: Comprobamos que el método insertarMaterial() funciona correctamente al ingresar un Material de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals(obras.getMaterial(), obras.insertarMaterial("Error: El Material de obra ingresado no es válido."));
    }

    @Test
    public void noInsertarMaterial() {

        // Creamos una instancia de la clase que tiene la propiedad Material
        obras obras = new obras();

        String expected = "Acero";
        insertarTipoEscultura();
        obras.setMaterial(expected);

        // Prueba 1: Comprobamos que el método insertarMaterial() funciona correctamente al ingresar un Material de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals("xxx", obras.insertarMaterial("Error: El Material de obra ingresado no es válido."));

        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals("  ", obras.insertarMaterial("Error: El Material de obra ingresado no es válido."));
    }

    @Test
    void setTécnica_GetTécnica() {
        obras obras = new obras();
        String Técnica = materialesPintura.getOleo();
        obras.setTécnica(Técnica);
        assertEquals(Técnica, obras.getTécnica());
    }

    @Test
    public void insertarTécnica() {

        // Creamos una instancia de la clase que tiene la propiedad Técnica
        obras obras = new obras();

        String expected = "Acero";
        insertarTipoPintura();
        obras.setTécnica(expected);

        // Prueba 1: Comprobamos que el método insertarTécnica() funciona correctamente al ingresar un Técnica de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals(obras.getTécnica(), obras.insertarTecnica("Error: El Técnica de obra ingresado no es válido."));
    }

    @Test
    public void noInsertarTécnica() {

        // Creamos una instancia de la clase que tiene la propiedad Técnica
        obras obras = new obras();

        String expected = "Acero";
        insertarTipoPintura();
        obras.setTécnica(expected);

        // Prueba 1: Comprobamos que el método insertarTécnica() funciona correctamente al ingresar un Técnica de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals("xxx", obras.insertarTecnica("Error: El Técnica de obra ingresado no es válido."));

        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals("  ", obras.insertarTecnica("Error: El Técnica de obra ingresado no es válido."));
    }

    @Test
    void setPiezas_GetPiezas() {
        obras obras = new obras();
        int Piezas = 4000;
        obras.setPiezas(Piezas);
        assertEquals(Piezas, obras.getPiezas());
    }

    @Test
    public void insertarPiezas() {

        obras obras = new obras();

        String expected = "1234.0";
        obras.setPiezas(Integer.parseInt(expected));

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));

        assertEquals(1234.0, obras.insertarAltura(), 0.1);
    }

    @Test
    void setDescripción_GetDescripción() {
        obras obras = new obras();
        String Descripción = "Dani";
        obras.setDescripción(Descripción);
        assertEquals(Descripción, obras.getDescripción());
    }

    @Test
    public void insertarDescripción() {

        // Creamos una instancia de la clase que tiene la propiedad Tipo
        obras obras = new obras();

        String expected = "Dani";
        obras.setDescripción(expected);

        // Prueba 1: Comprobamos que el método insertarTipo() funciona correctamente al ingresar un tipo de obra válido
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        assertEquals(obras.getDescripción(), obras.insertarDescripción());
    }

    @Test
    void getTamaño() {
        obras obras = new obras();
        int tamaño = 0;
        assertEquals(tamaño, obras.getTamaño());
    }

    @Test
    public void Cabeceros() {
        // Creamos una instancia de la clase que tiene el método Cabeceros
        final String BLANCO = "\u001B[37m";
        final String CYAN = "\u001B[36m";
        obras obras = new obras();

        // Definimos la cadena de texto esperada
        String expected = CYAN +"| %1s | %9s | %15s | %10s | %10s | %10s | %10s | %10s |%10s | %5s | %30s |%n" + BLANCO +
                        CYAN + "_____________________________________________________________________________________________________________________________________________________________" + BLANCO;

        expected = String.format(expected, "ID", "TIPO", "NOMBRE", "AUTOR", "PRECIO", "ALTURA", "PESO", "MATERIAL", "TÉCNICA", "PIEZAS", "DESCRIPCIÓN");

        // Obtenemos el valor retornado por el método Cabeceros
        String result = obras.Cabeceros();

        // Comparamos el valor retornado con el valor esperado
        assertEquals(expected, result);
    }

    @Test
    public void testToString() {
        obras obra = new obras("1", "Pintura", "La Mona Lisa", "Leonardo da Vinci", 1000000.0, 77.0, 18.0, "Óleo sobre tabla", "Pintura al óleo", 1, "Retrato de Lisa Gherardini, esposa de Francesco del Giocondo");

        String expectedOutput = "| 1  |   Pintura |    La Mona Lisa | Leonardo da Vinci | 1000000,00 |      77,00 |      18,00 | Óleo sobre tabla | Pintura al óleo |     1 |      Retrato de Lisa Gherardin |" + "\n";
        String actualOutput = obra.toString();

        assertEquals(expectedOutput, actualOutput);
}







}

