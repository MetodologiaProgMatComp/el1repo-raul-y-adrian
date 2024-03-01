package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio8;

import es.uah.matcomp.mp.el1.practica2Clases.Ejercicio6.MyPoint;

public class MyCircle {
    MyPoint center=new MyPoint();
    private int radius=1;

    public MyCircle(){

    }

    public  MyCircle(int x, int y, int radius){

    }

    public MyCircle(MyPoint center, int radius){

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return getCenterY();

    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }
    public  void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return (Math.PI*radius*radius);
    }

    public double distance(MyCircle another){
        return Math.sqrt((center.distance(another.getCenterXY()));
    }

}
