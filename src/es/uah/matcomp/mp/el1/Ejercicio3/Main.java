package es.uah.matcomp.mp.el1.Ejercicio3;

public class Main {
    public static void main(String[] args){
        Rectangle c1= new Rectangle(2,4);
        float length=c1.getLength();
        float width=c1.getWidth();
        double area=c1.getArea();
        double perimetro= c1.getPerimeter();

        System.out.println("La length es: " + length);
        System.out.println("La width es: " + width);
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}
