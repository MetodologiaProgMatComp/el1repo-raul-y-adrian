package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio6;

public class main {
    public static void main(String[] args){
        MyPoint c1=new MyPoint();
        c1.setX(2);
        c1.setY(3);

        System.out.println("{" + c1.getXY()[0] + "," +  c1.getXY()[1] + "}");
        c1.setXY(1,1);
        System.out.println(c1.toString());
        System.out.println(c1.distance(2,2));
        MyPoint c2= new MyPoint();
        c2.setX(4);
        c2.setY(3);
        System.out.println(c1.distance(c2));
    }
}
