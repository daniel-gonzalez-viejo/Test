package daw.programacion.notas;

public class notas {
    
public String notaTexto (double nota) {

    String NotaEnTexto;

    if(nota < 0 || nota > 10) {
        System.out.println("La nota no puede ser menos de 0 y mayor de 10");
    }
    return NotaEnTexto;
}

}