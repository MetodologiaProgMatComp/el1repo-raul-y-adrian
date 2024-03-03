package es.uah.matcomp.mp.el1.practica1.Ejercicio3;

public class Rectangle {
    private float length=1.0f;
    private float width=1.0f;

    //Conctructores
    public Rectangle() {
    }
    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float newLength) {
        length=newLength;
    }

    public void setWidth(float newWidth) {
        width = newWidth;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return length*2+width*2;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

