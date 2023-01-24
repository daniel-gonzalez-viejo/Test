package daw.programacion.rectangulo;

public class ClaseRectangulo {
    private float length = 2.0f;
    private float width = 1.0f;

    public ClaseRectangulo() {}

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    };

    public float getArea() {
        return length*width;
    }

    public float getPerimetro() {
        return length*2 + width*2;
    }

    @Override
    public String toString() {
        return "ClaseRectangulo [La longitud es =" + length + ", y la anchura es =" + width + "]";
    }

    
}

