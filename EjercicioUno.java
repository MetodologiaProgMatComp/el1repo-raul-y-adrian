package Práctica1;

public class EjercicioUno {
    private double radius;

    private String color;
    //Constructores (sobrecargados)


    //daasassa
    //sasaassa
    public Circle() {
        radius = 2.0;

        color = "rojo";
    }
    public Circle(double r){//2 constructor
        radius = r;
        color= "rojo";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea (){
        return radius*radius*Math.PI;
    }

}
