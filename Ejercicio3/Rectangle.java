package Práctica1.Ejercicio3;

public class Rectangle {
    private float length;
    private float width;

    //Conctructores
    public Rectangle() {
        float length = 1.0f;
        float width = 1.0f;
    }
    public Rectangle(float l, float w){
        length=l;
        width=w;
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

