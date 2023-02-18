package daw.programacion.clasesMuseo.clasesMuseo;

public class materialesEscultura {
    protected final static String ACERO = "Acero";
    protected final static String COBRE = "Cobre";
    protected final static String HIERRO = "Hierro";
    
    protected final static String MATERIALES[] = {ACERO, COBRE, HIERRO};

    public static String getAcero() {
        return ACERO;
    }
    public static String getCobre() {
        return COBRE;
    }
    public static String getHierro() {
        return HIERRO;
    }
    public String[] getMateriales() {
        return MATERIALES;
    }

    interface TIPO_MATERIALES_ESCULTURA {
        public static String getAcero() {
            return ACERO;
        }
        public static String getCobre() {
            return COBRE;
        }
        public static String getHierro() {
            return HIERRO;
        }
        public static String[] getMateriales() {
            return MATERIALES;
        }
    }
}
