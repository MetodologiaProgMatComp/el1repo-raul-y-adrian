package es.uah.matcomp.mp.el1.practica3.Ejercicio3;

public class Main {
    public static  void main(String[] args){
        Point2D point2D=new Point2D();

        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        point2D.setXY(2,9);
        System.out.println(point2D.getXY());

    }
}
