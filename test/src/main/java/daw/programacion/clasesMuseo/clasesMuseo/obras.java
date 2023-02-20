package daw.programacion.clasesMuseo.clasesMuseo;

import java.util.InputMismatchException;
import java.util.Scanner;

import daw.programacion.clasesMuseo.clasesMuseo.materialesEscultura.TIPO_MATERIALES_ESCULTURA;
import daw.programacion.clasesMuseo.clasesMuseo.materialesPintura.TIPO_MATERIALES_PINTURA;
import daw.programacion.clasesMuseo.clasesMuseo.tipoObra.TIPO_OBRA;


public class obras implements TIPO_OBRA, TIPO_MATERIALES_ESCULTURA, TIPO_MATERIALES_PINTURA{
    final static String ROJO = "\u001B[31m";
    final static String VERDE = "\u001B[32m";
    final static String AMARILLO = "\u001B[33m";
    final static String AZUL = "\u001B[34m";
    final static String MORADO = "\u001B[35m";
    final static String CYAN = "\u001B[36m";
    final static String BLANCO = "\u001B[37m";

    final static String ID = VERDE + "ID: " + BLANCO;
    final static String TIPO = VERDE + "Tipo: " + BLANCO;
    final static String NOMBRE = VERDE + "Nombre: " + BLANCO;
    final static String AUTOR = VERDE + "Autor: " + BLANCO;
    final static String PRECIO = VERDE + "Precio: " + BLANCO;
    final static String ALTURA = VERDE + "Altura: " + BLANCO;
    final static String PESO = VERDE + "Peso: " + BLANCO;
    final static String MATERIAL = VERDE + "Material: " + BLANCO;
    final static String TÉCNICA = VERDE + "Técnica: " + BLANCO;
    final static String PIEZAS = VERDE + "Piezas: " + BLANCO;
    final static String DESCRIPCIÓN = VERDE + "Descripción: " + BLANCO;

    final static String MENSAJE_ERROR_TIPO_EN_BLANCO = ROJO + "No se permite la inserción de nombres en blanco" + BLANCO;
    final static String MENSAJE_ERROR_TIPO = ROJO + "Únicamente se aceptan obras de tipo [Pintura] o [Escultura]. Comprueba que esté escrito correctamente " + BLANCO;
    final static String MENSAJE_ERROR_MATERIAL = ROJO + "Únicamente se aceptan materiales de tipo [Acero], [Cobre] o [Hierro]. Comprueba que esté escrito correctamente " + BLANCO;
    final static String MENSAJE_ERROR_TECNICA = ROJO + "Únicamente se aceptan técnicas de tipo [Oleo], [Acuarela] o [Carboncillo]. Comprueba que esté escrito correctamente " + BLANCO;
    final static String MENSAJE_ERROR_PRECIO = ROJO + "El precio debe ser de carácter numérico " + BLANCO;
    final static String MENSAJE_ERROR_ALTURA = ROJO + "La altura debe ser de carácter numérico " + BLANCO;
    final static String MENSAJE_ERROR_PESO = ROJO + "El peso debe ser de carácter numérico " + BLANCO;
    final static String MENSAJE_ERROR_PIEZAS = ROJO + "La cantidad de piezas debe ser de carácter numérico " + BLANCO;

    static obras P1 = new obras("1" , "Pintura", "Guernica", "P.Picasso" , 1000 , 5 , 2 , " " ,   "Óleo" , 5 , "Cuadro de la guerra civil");
    static obras P2 = new obras("2" , "Pintura", "La Vie" , "P.Picasso" , 200 , 5 , 1 , " " , "Óleo" , 5 , "Óleo");
    static obras P3 = new obras("3" , "Pintura", "El Sueño" , "P.Picasso" , 300 , 5 , 1.3 , " " ,   "Óleo" , 5 , "Óleo");
    static obras P4 = new obras("4" , "Pintura", "Retrato.D Maar" , "P.Picasso" , 400 , 5 , 1 , " " , "Óleo" , 5 , "Óleo");
    static obras P5 = new obras("5" , "Escultura", "El piel roja" , "U.Chueca" , 350 , 5 , 1 , "Acero" , " " ,  5 , "Escultura");

    static boolean inserción_exitosa = false;    

    private String id;
    private static String Tipo;
    private static String Nombre;
    private static String Autor;
    private static double Precio;
    private static double Altura;
    private static double Peso;
    private static String Material;
    private static String Técnica;
    private static int Piezas;
    private static String Descripción;

    protected static int tamaño;
    protected static obras vec[];
    protected static int posiciones;

    public obras(String id, String tipo, String nombre, String autor, double precio, double altura, double peso,
            String material, String técnica, int piezas, String descripción) {
        this.id = id;
        this.Tipo = tipo;
        this.Nombre = nombre;
        this.Autor = autor;
        this.Precio = precio;
        this.Altura = altura;
        this.Peso = peso;
        this.Material = material;
        this.Técnica = técnica;
        this.Piezas = piezas;
        this.Descripción = descripción;
    }

    public obras() {
    }

    final static obras[] OBRAS_INICIALES = {P1, P2, P3, P4, P5};

    public String getID() {
        return id;
    }

    public void setID(String iD) {
        id = iD;
    }

    public void insertarID() {
        int contador = OBRAS_INICIALES.length+1;
        String id = Integer.toString(contador);
        setID(id);
        contador++;
    }

    public static String getTipo() {
        return Tipo;
    }
    public static void setTipo(String tipo) {
        Tipo = tipo;
    }
    public static String insertarTipo(String mensaje_error) {
        while (!inserción_exitosa) {
            boolean error_mostrado = false;
            Scanner sc = new Scanner(System.in);
            System.out.print(TIPO);
            setTipo(sc.nextLine());
            for(String t: TIPO_OBRA.getTipos()){
                if (t.equals(getTipo())) {    
                    inserción_exitosa = true;
                    error_mostrado = true;
                    break;
                } 
            }
            if (!error_mostrado) {
                System.out.println(mensaje_error);
                error_mostrado = true;
            }
        }
        inserción_exitosa = false;
        return getTipo();
    }
    public static String getNombre() {
        return Nombre;
    }
    public static void setNombre(String nombre) {
        Nombre = nombre;
    }

    public static String insertarNombre() {
        while (!inserción_exitosa) {
            Scanner sc = new Scanner(System.in);
            System.out.print(NOMBRE);
            setNombre(sc.nextLine());
            if (!getNombre().isEmpty() && !getNombre().isBlank()) {
                inserción_exitosa = true;
                break;
            }
            else {
                System.out.println(MENSAJE_ERROR_TIPO_EN_BLANCO);
                setNombre("");
            }
        }
        inserción_exitosa = false;
        return getNombre();
    }

    public static String getAutor() {
        return Autor;
    }
    public static void setAutor(String autor) {
        Autor = autor;
    }

    public static String insertarAutor() {
        Scanner sc = new Scanner(System.in);
        System.out.print(AUTOR);
        setAutor(sc.nextLine());
        return getAutor();
    }

    public static double getPrecio() {
        return Precio;
    }
    public static void setPrecio(double precio) {
        Precio = precio;
    }

    public static double insertarPrecio() {
        while(!inserción_exitosa) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(PRECIO);
                setPrecio(sc.nextDouble());
                inserción_exitosa = true;
            }
            catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR_PRECIO);
            }
        }
        inserción_exitosa = false;
        return getPrecio();
    }

    public static double getAltura() {
        return Altura;
    }
    public static void setAltura(double altura) {
        Altura = altura;
    }
    public static double insertarAltura() {
        while(!inserción_exitosa) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(ALTURA);
                setAltura(sc.nextDouble());
                inserción_exitosa = true;
            }
            catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR_ALTURA);
            }
        }
        inserción_exitosa = false;
        return getAltura();
    }
    public static double getPeso() {
        return Peso;
    }
    public static void setPeso(double peso) {
        Peso = peso;
    }
    public static double insertarPeso() {
        while(!inserción_exitosa) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(PESO);
                setPeso(sc.nextDouble());
                inserción_exitosa = true;
            }
            catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR_PESO);
            }
        }
        inserción_exitosa = false;
        return getPeso();
    }

    public static String getMaterial() {
        return Material;
    }
    public static void setMaterial(String material) {
        Material = material;
    }
    public static String insertarMaterial(String mensaje_error) {
        if (getTipo().equals(TIPO_OBRA.getPintura())) {
            setMaterial("   ");
        }
        else if (getTipo().equals(TIPO_OBRA.getEscultura())){
            while (!inserción_exitosa) {
            boolean error_mostrado = false;
            Scanner sc = new Scanner(System.in);
            System.out.print(MATERIAL);
            setMaterial(sc.nextLine());
                for(String m: TIPO_MATERIALES_ESCULTURA.getMateriales()){
                    if (m.equals(getMaterial())) {
                        inserción_exitosa = true;
                        error_mostrado = true;
                        break;
                    }
                }
                if (!error_mostrado) {
                    System.out.println(mensaje_error);
                    error_mostrado = true;
                }  
            }
            inserción_exitosa = false;
        }
        return getMaterial();
    }
    public static String getTécnica() {
        return Técnica;
    }
    public static void setTécnica(String técnica) {
        Técnica = técnica;
    }
    public static String insertarTecnica(String mensaje_error) {
        if (getTipo().equals(TIPO_OBRA.getEscultura())) {
            setTécnica("   ");
        }
        else if (getTipo().equals(TIPO_OBRA.getPintura())) {
            boolean error_mostrado = false;
            while (!inserción_exitosa) {
            Scanner sc = new Scanner(System.in);
            System.out.print(TÉCNICA);
            setTécnica(sc.nextLine());
                for(String m: TIPO_MATERIALES_PINTURA.getMateriales()){
                    if (m.equals(getTécnica())) {
                        inserción_exitosa = true;
                        error_mostrado = true;
                        break;
                    }
                }
                if (!error_mostrado) {
                    System.out.println(mensaje_error);
                    error_mostrado = true;
                }  
            }
            inserción_exitosa = false;
        }
        return getTécnica();
    }

    public static int getPiezas() {
        return Piezas;
    }
    public static void setPiezas(int piezas) {
        Piezas = piezas;
    }
    public static int insertarPiezas() {
        while(!inserción_exitosa) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(PIEZAS);
                setPiezas(sc.nextInt());
                inserción_exitosa = true;
            }
            catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR_PIEZAS);
            }
        }
        inserción_exitosa = false;
        return getPiezas();
    }

    public static String getDescripción() {
        return Descripción;
    }
    public static void setDescripción(String descripción) {
        Descripción = descripción;
    }
    public static String insertarDescripción() {
        Scanner sc = new Scanner(System.in);
        System.out.print(DESCRIPCIÓN);
        setDescripción(sc.nextLine());
        return getDescripción();
    }

    public int getTamaño() {
        return tamaño;
    }

    public static String Cabeceros() {
        String separador = CYAN + "| %1s | %9s | %15s | %10s | %10s | %10s | %10s | %10s |%10s | %5s | %30s |%n" + BLANCO;

        String s = String.format(separador,
        "ID", "TIPO", "NOMBRE", "AUTOR", "PRECIO", "ALTURA", "PESO", "MATERIAL", "TÉCNICA", "PIEZAS", "DESCRIPCIÓN" 
        );
        System.out.printf(s);

        System.out.println(CYAN + "_____________________________________________________________________________________________________________________________________________________________" + BLANCO);
        return  "";
    }
    


    @Override
    public String toString() {
        String separador = "| %1s  | %9s | %15s | %10s | %10.2f | %10.2f | %10.2f | %10s | %10s | %5d | %30s |%n";
        
        String s = String.format(separador, 
        id, Tipo, Nombre.length() > 15 ? Nombre.substring(0, 15) : Nombre, 
        Autor, Precio, Altura, Peso, Material, Técnica, Piezas, 
        Descripción.length() > 30 ? Descripción.substring(0, 25) : Descripción
    );

        System.out.printf(s);
        
        return "";
    }

    
    
}