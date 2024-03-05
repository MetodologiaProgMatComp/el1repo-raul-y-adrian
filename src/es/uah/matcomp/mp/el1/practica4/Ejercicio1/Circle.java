package es.uah.matcomp.mp.el1.practica4.Ejercicio1;

public class Circle extends Shape{
    protected double radius=1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color="+this.getColor() +
                ", filled="+this.isFilled()+"],radius=" + radius +
                ']';
    }
}
