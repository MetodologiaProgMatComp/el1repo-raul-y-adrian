package es.uah.matcomp.mp.el1.practica2.Ejercicio8;

import es.uah.matcomp.mp.el1.practica2.Ejercicio6.MyPoint;

public class Main {
    public static void main(String[] args) {
        //Creamos un circulo de prueba usando uno de los 3 constructores
        MyPoint centro = new MyPoint(2, 2);
        MyCircle circle = new MyCircle(centro, 4);

        //Prueba de las funciones para la clase MyCircle
        System.out.println("El radio del circulo es de: " + circle.getRadius());
        circle.setRadius(7);
        System.out.println("El nuevo radio del circulo es de: " + circle.getRadius());
        System.out.println("El centro del circulo es: " + circle.getCenter());
        circle.setCenterXY(10, 10);
        System.out.println("El nuevo centro del circulo es: " + circle.getCenter());
        System.out.println("Las cualidades (toString()) del circulo son: " + circle.toString());
        System.out.println("El area del circulo es de: " + circle.getArea());
        System.out.println("La circunferencia del circulo es de: " + circle.getCincurference());
        //Nuevo circulo para la distancia; usando otro constructor
        MyCircle circle2=new MyCircle(8,8,32);
        System.out.println("La distancia del circulo1 al circulo2 es de: "+ circle.distance(circle2));
    }
}
