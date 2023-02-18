package daw.programacion.clasesMuseo.clasesMuseo;

public class darDeAltaUnaObraDeArte extends verObras{

    public darDeAltaUnaObraDeArte() {
    }

    public void darDeAlta() {
        insertarID();
        insertarTipo(MENSAJE_ERROR_TIPO);
        insertarNombre();
        insertarAutor();
        insertarPrecio(); 
        insertarAltura();
        insertarPeso();
        insertarMaterial(MENSAJE_ERROR_MATERIAL);
        insertarTecnica(MENSAJE_ERROR_TECNICA);
        insertarPiezas();
        insertarDescripción();
    }

    public obras nuevaObra() {
        darDeAlta();
        obras P6 = new obras(getID() , getTipo(), getNombre(), getAutor() , getPrecio() , getAltura() , getPeso() , 
          getMaterial() , getTécnica() , getPiezas() , getDescripción());
        return P6;
    }

}
