package es.uah.matcomp.mp.el1.practica2.Ejercicio9;

import es.uah.matcomp.mp.el1.practica2.Ejercicio6.MyPoint;

public class MyTriangle {
    MyPoint myPoint=new MyPoint();
    private MyPoint v1;
    private MyPoint v2;
    private  MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){

    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1="+"(" + v1 +")"+
                ", v2="+"(" + v2 +")"+
                ", v3=" + "("+ v3 +")"+
                ']';
    }

    public double getPerimeter(){
        double distancia1= Math.sqrt((v1.getX()-v2.getX())*(v1.getX()-v2.getX())+(v1.getY()-v2.getY())*(v1.getY()-v2.getY()));
        double distancia2= Math.sqrt((v2.getX()-v3.getX())*(v2.getX()-v3.getX())+(v2.getY()-v3.getY())*(v2.getY()-v3.getY()));
        double distancia3=Math.sqrt((v1.getX()-v3.getX())*(v1.getX()-v3.getX())+(v1.getY()-v3.getY())*(v1.getY()-v3.getY()));

        return distancia1+distancia2+distancia3;
    }


    public String getType(){
        double distancia1= Math.sqrt((v1.getX()-v2.getX())*(v1.getX()-v2.getX())+(v1.getY()-v2.getY())*(v1.getY()-v2.getY()));
        double distancia2= Math.sqrt((v2.getX()-v3.getX())*(v2.getX()-v3.getX())+(v2.getY()-v3.getY())*(v2.getY()-v3.getY()));
        double distancia3=Math.sqrt((v1.getX()-v3.getX())*(v1.getX()-v3.getX())+(v1.getY()-v3.getY())*(v1.getY()-v3.getY()));


        if (distancia1 == distancia2 && distancia2 == distancia3) {
            return "Equilatero";
        } else if (distancia1 == distancia2 || distancia1 == distancia3 || distancia2 == distancia3) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }

    }


}
