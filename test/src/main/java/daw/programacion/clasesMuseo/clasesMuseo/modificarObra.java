package daw.programacion.clasesMuseo.clasesMuseo;
import java.util.Scanner;

public class modificarObra extends darDeAltaUnaObraDeArte {

    final String MENSAJE_PEDIR_OBRA = CYAN + "¿Qué obra quieres visualizar?: " + BLANCO;

    Scanner sc = new Scanner(System.in);
    String código;
    
    public modificarObra() {
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String cod) {
        código = cod;
    }

    public String pedirObra() {
        System.out.print(MENSAJE_PEDIR_OBRA);
        setCódigo(sc.nextLine());
        System.out.println();
        return getCódigo();
    }

    public void modificar(obras aux) {             
            if (aux != null) {
                aux.setTipo(insertarTipo(MENSAJE_ERROR_TIPO));
                aux.setNombre(insertarNombre());
                aux.setAutor(insertarAutor());
                aux.setPrecio(insertarPrecio());
                aux.setAltura(insertarAltura());
                aux.setPeso(insertarPeso());
                aux.setMaterial(insertarMaterial(MENSAJE_ERROR_MATERIAL));
                aux.setTécnica(insertarTecnica(MENSAJE_ERROR_TECNICA));
                aux.setPiezas(insertarPiezas());
                aux.setDescripción(insertarDescripción());
            }     
        }
}
