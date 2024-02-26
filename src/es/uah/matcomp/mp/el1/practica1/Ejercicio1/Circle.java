package es.uah.matcomp.mp.el1.practica1.Ejercicio1;

public class Circle {
    private double radius;

    private String color;

    //Constructores
    public Circle() {
        radius=1.0;
        color="red";

    }

    public Circle(double r) {
        radius=r;
        color="red";
    }



    //Metodos
    public double getRadius (){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
//No se puede ejecutar la clase creada porque no accedemos a nada de ella desde un archivo "Main"