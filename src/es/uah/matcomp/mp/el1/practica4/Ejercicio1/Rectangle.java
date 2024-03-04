package es.uah.matcomp.mp.el1.practica4.Ejercicio1;

import es.uah.matcomp.mp.el1.practica3.Ejercicio5.Shape;

public class Rectangle extends Shape {

    protected double length = 1.0;
    protected double width = 1.0;

    //Constructores
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(float newLength) {
        length = newLength;
    }

    public void setWidth(float newWidth) {
        width = newWidth;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    public String toString() {
        return "Rectangle[Shape[color=" + this.getColor()+",filled="+this.isFilled()+
                "],length=" + length +
                ", width=" + width +
                ']';
    }
}



