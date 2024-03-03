package es.uah.matcomp.mp.el1.practica3.Ejercicio4;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        Point point=new Point();

        point.setXY(2,3);
        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(Arrays.toString(point.getXY()));

        MovablePoint movablePoint=new MovablePoint();

        movablePoint.setxSpeed(1);
        movablePoint.setySpeed(3);
        System.out.println(movablePoint.getxSpeed());
        System.out.println(movablePoint.getySpeed());
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        System.out.println(movablePoint.move());

    }
}
