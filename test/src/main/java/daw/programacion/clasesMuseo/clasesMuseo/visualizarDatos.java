package daw.programacion.clasesMuseo.clasesMuseo;

public class visualizarDatos extends modificarObra{

    public visualizarDatos() {
    }

    public void mostrarDatos(obras aux) {         
            if (aux != null) {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println(NOMBRE + aux.getNombre());
                System.out.println(AUTOR + aux.getAutor());
                System.out.println(PRECIO + aux.getPrecio());
                System.out.println(ALTURA + aux.getAltura());
                System.out.println(PESO + aux.getPeso());
                System.out.println(PIEZAS + aux.getPiezas());
                System.out.println(DESCRIPCIÓN + aux.getDescripción());
                System.out.println("");
            } 
    }

}
