package es.uah.matcomp.mp.el1.practica2.Ejercicio9;

import es.uah.matcomp.mp.el1.practica2.Ejercicio6.MyPoint;

public class MyTriangle {
    MyPoint myPoint=new MyPoint();
    private MyPoint v1;
    private MyPoint v2;
    private  MyPoint v3;
    //Constructores
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1=new MyPoint(x1,y1);
        this.v2=new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;

    }
    //Funciones para las cualidades del triangulo
    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1="+"(" + v1 +")"+
                ", v2="+"(" + v2 +")"+
                ", v3=" + "("+ v3 +")"+
                ']';
    }

    public double getPerimeter(){
        double distancia1=v1.distance(v2);
        double distancia2=v2.distance(v3);
        double distancia3=v3.distance(v1);

        return distancia1+distancia2+distancia3;
    }


    public String getType(){
        double distancia1=v1.distance(v2);
        double distancia2=v2.distance(v3);
        double distancia3=v3.distance(v1);

        if (distancia1 == distancia2 & distancia2 == distancia3) {
            return "Equilatero";
        } else if (distancia1 == distancia2 || distancia1 == distancia3 || distancia2 == distancia3) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }

    }


}
