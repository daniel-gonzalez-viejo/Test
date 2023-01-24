package daw.programacion.circulo;

public class ClaseCirculo {
    public double radio;

    ClaseCirculo () {
        radio = 1.0;
    }

    private ClaseCirculo(double radio) {
        radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return radio*radio*Math.PI;
    }
    
}
