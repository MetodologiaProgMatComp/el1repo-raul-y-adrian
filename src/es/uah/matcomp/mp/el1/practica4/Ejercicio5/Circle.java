package es.uah.matcomp.mp.el1.practica4.Ejercicio5;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius ;
    }

    @Override
    public double getArea() {
        return this.radius*Math.PI*this.radius;
    }
}
