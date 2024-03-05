package es.uah.matcomp.mp.el1.practica4.Ejercicio2;

public class Rectangle implements GeometricObject {
    private double length;
    private double width;
    public Rectangle(double wifth, double length){
        this.width=width;
        this.length=length;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
}
