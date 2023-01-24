package daw.programacion.esfera;

public class ClaseEsfera {
    private float x;
    private float y;
    private int radio;
    private float deltaX = x;
    private float deltaY = y;

    public ClaseEsfera(float x, float y, int radio, float deltaX, float deltaY) {}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public float getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }

    public float getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    };

    public void move() {
        this.x = x + deltaX;
        this.y = y + deltaY;
    }

    public void reflejoHorizontal() {
        this.deltaX = -deltaX;
    }

    public void reflejoVertical() {
        this.deltaY = -deltaY;
    }

    @Override
    public String toString() {
        return "Esfera [" + x + "," + y + "] Velocidad ["+ deltaX + "," + deltaY + "]";
    }

    
    
}
