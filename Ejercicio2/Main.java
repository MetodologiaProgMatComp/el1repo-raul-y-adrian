package Práctica1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        double area = c1.getArea();
        double circumferencia = c1.getCircumference();

        System.out.println("El area es: " + area);
        System.out.println("La circunferencia es: " + circumferencia);
        System.out.println("El radio es: " + c1.toString());
    }
}
