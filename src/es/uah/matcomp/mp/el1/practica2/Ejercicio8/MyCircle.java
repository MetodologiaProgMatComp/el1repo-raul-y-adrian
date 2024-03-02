package es.uah.matcomp.mp.el1.practica2.Ejercicio8;

import es.uah.matcomp.mp.el1.practica2.Ejercicio6.MyPoint;

public class MyCircle {
    MyPoint center = new MyPoint();
    private int radius = 1;

    //Constructores
    public MyCircle() {

    }

    public MyCircle(int x, int y, int radius) {

    }

    public MyCircle(MyPoint center, int radius) {

    }

    //Funciones para el circulo
    //Funciones para el radio
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    //Funciones para el centro
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();

    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }
    //Funcion Tostring()
    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }
    //Funciones que devuelven cualidades del circulo
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getCincurference() {
        return (2 * Math.PI * this.getRadius());
    }

    public double distance(MyCircle another) {
        return (center.distance(another.getCenter()));
    }
    //}

}
