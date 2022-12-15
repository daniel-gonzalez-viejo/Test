package daw.programacion.calculadora;


import static org.junit.Assert.*;
import org.junit.Test;
import daw.programacion.test.calculadora.calculadora;

public class calculadoraTest {
            @Test
            public void dosSumarDosEsCuatro(){
                int expected = 4;
                int numero1 = 2;
                int numero2 = 2;
                calculadora calc = new calculadora();
        
               // assertEquals(expected, calc.sumar(numero1, numero2));
                assertTrue("Dos más dos debería ser 4", expected == calc.sumar(numero1, numero2));
            }
  
            @Test
            public void sieteMenosTresEsCuatro(){
                int expected = 4;
                int numero1 = 7;
                int numero2 = 3;
                calculadora calc = new calculadora();
        
               // assertEquals(expected, calc.sumar(numero1, numero2));
                assertTrue("Siete menos tres debería ser 4", expected == calc.restar(numero1, numero2));
            }

            @Test
            public void sietePorTresEsVeintiuno(){
                int expected = 21;
                int numero1 = 7;
                int numero2 = 3;
                calculadora calc = new calculadora();
        
               // assertEquals(expected, calc.sumar(numero1, numero2));
                assertTrue("Siete menos tres debería ser 4", expected == calc.multiplicar(numero1, numero2));
            }

            @Test
            public void sieteEntreDosEsTres(){
                int expected = 3;
                int numero1 = 7;
                int numero2 = 2;
                calculadora calc = new calculadora();
        
               // assertEquals(expected, calc.sumar(numero1, numero2));
                assertTrue("Siete entre dos debería ser 3", expected == calc.dividir(numero1, numero2));
            }

}


