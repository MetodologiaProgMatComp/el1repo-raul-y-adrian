package es.uah.matcomp.mp.el1.practica4.Ejercicio5;

public class Main {
    public static void main(String[] args){
        Circle c1=new Circle(2);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        ResizableCircle r1=new ResizableCircle(23);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

    }
}
