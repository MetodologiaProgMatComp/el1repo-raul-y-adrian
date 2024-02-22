package es.uah.matcomp.mp.el1.Ejercicio2;

public class Circle {
    private double radius;

    //Constructores
    public Circle() {
        radius = 3.0;
    }

    public Circle(double r) {
        radius = r;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;


    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
