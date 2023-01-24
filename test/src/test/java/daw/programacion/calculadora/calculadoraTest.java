package daw.programacion.calculadora;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import daw.programacion.calculadora.calculadora.calculadora;


public class calculadoraTest {

            @Test
            public void dosSumarDosEsCuatro(){
                int expected = 4;
                int numero1 = 2;
                int numero2 = 2;
                calculadora calc = new calculadora();
        
                assertEquals(expected, calc.sumar(numero1, numero2));
            }
  
            @Test
            public void sieteMenosTresEsCuatro(){
                int expected = 4;
                int numero1 = 7;
                int numero2 = 3;
                calculadora calc = new calculadora();
        
                assertEquals(expected, calc.restar(numero1, numero2));
            }

            @Test
            public void sietePorTresEsVeintiuno(){
                int expected = 21;
                int numero1 = 7;
                int numero2 = 3;
                calculadora calc = new calculadora();
        
                assertEquals(expected, calc.multiplicar(numero1, numero2));
            }

            @Test
            public void sieteEntreDosEsTres(){
                int expected = 3;
                int numero1 = 7;
                int numero2 = 2;
                calculadora calc = new calculadora();
        
                assertEquals(expected, calc.dividir(numero1, numero2));
            }

}


