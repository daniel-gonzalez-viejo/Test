package daw.programacion.clasesMuseo.clasesMuseo;

public class verObras extends obras{

    public verObras(int n) {
        tamaño = n;
        vec = new obras[tamaño];
        posiciones = 0;
    }

    public verObras() {
    }

    public static void aumentarTamaño(obras valor) { 
        if (tamaño == vec.length) {
          obras[] newData = new obras[vec.length + 1];
          System.arraycopy(vec, 0, newData, 0, vec.length);
          vec = newData;
        }
        vec[tamaño++] = valor;
    }

    public static boolean agregar (obras n) {
        aumentarTamaño(n);
        if(posiciones < tamaño) {
            vec[posiciones++] = n;
            return true;
        }
        return false;
    }

    public obras buscar(String id) {
        for (int i = 0; i < posiciones; i++) {
            if(vec[i].getID().equals(id)) {
                return vec[i];
            }
        }
        return null;
    }

    public String toStrin() {
        String s = "";
        for (int i = 0; i < posiciones; i++) {
            s += vec[i].toString();
        }
        return s;
    }

    
}