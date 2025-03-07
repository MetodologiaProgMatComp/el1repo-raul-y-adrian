package es.uah.matcomp.mp.el1.practica4.Ejercicio2;

import es.uah.matcomp.mp.el1.practica4.Ejercicio5.GeometricObject;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
