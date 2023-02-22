package daw.programacion.clasesMuseo.clasesMuseo;

public class imprimirEtiqueta extends modificarObra{

    public imprimirEtiqueta() {
    }

    public String imprimirUnaEtiqueta(obras aux) {
        if (aux != null) {
            System.out.println(NOMBRE + aux.getNombre());
            System.out.println(AUTOR + aux.getAutor());
            System.out.println(DESCRIPCIÓN + aux.getDescripción());
        }
        return NOMBRE + aux.getNombre() + "\n" + AUTOR + aux.getAutor() + DESCRIPCIÓN + aux.getDescripción();

    }
    
    
}
