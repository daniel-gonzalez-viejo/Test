package daw.programacion.clasesMuseo.clasesMuseo;
import java.util.Scanner;

public class modificarObra extends darDeAltaUnaObraDeArte {

    final static String MENSAJE_PEDIR_OBRA = CYAN + "¿Qué obra quieres visualizar?: " + BLANCO;

    static Scanner sc = new Scanner(System.in);
    static String código;
    
    public modificarObra() {
    }

    public static String getCódigo() {
        return código;
    }

    public static void setCódigo(String cod) {
        código = cod;
    }

    public static void pedirObra() {
        System.out.print(MENSAJE_PEDIR_OBRA);
        setCódigo(sc.nextLine());
        System.out.println();
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
