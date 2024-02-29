package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio6;

public class main {
    public static void main(String[] args){
        MyPoint c1=new MyPoint();
        c1.setX(2);
        c1.setY(3);
        System.out.println("{" + c1.getXY()[0] + "," +  c1.getXY()[1] + "}");
    }
}
