package es.uah.matcomp.mp.el1.practica3.Ejercicio5;

public class Main {
    public static void main(String[] Args) {
        Circle circulo = new Circle(12, "Red", true);
        System.out.println("El area del circulo es: "+circulo.getArea());
        System.out.println("El radio del circulo es: "+circulo.getRadius());
        System.out.println("Esta relleno el circulo?: "+circulo.isFilled());
        circulo.setRadius(100);
        System.out.println("El nuevo radio del circulo es: "+circulo.getRadius());
        System.out.println("El perimetro del circulo es: "+circulo.getPerimeter());

        Rectangle rectangulo=new Rectangle(10,20,"Blue",false);
        System.out.println("El ancho del rectangulo es: "+rectangulo.getWidth());
        System.out.println("El largo del rectangulo es: "+rectangulo.getLength());
        System.out.println("El area del rectangulo es: "+rectangulo.getArea());
        System.out.println("Esta relleno el rectangulo?: "+rectangulo.isFilled());

        circulo.setRadius(100);
        System.out.println("El perimetro del rectangulo es: "+rectangulo.getPerimeter());
        System.out.println("La informacion del rectangulo (toString()) es: "+rectangulo.toString());

    }
}
