package es.uah.matcomp.mp.el1.practica4.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(0, 0, 2, 2);
        System.out.println("El punto al inicio es: "+m1.toString());
        m1.moveUp();
        System.out.println("El punto despues de moverse hacia arriba es: "+m1);
        m1.moveLeft();
        System.out.println("El punto despues de moverse hacia la izquierda es: "+m1);
        m1.moveDown();
        System.out.println("El punto despues de moverse hacia abajo es: "+m1);
        m1.moveRight();
        System.out.println("El punto despues de moverse hacia la derecha es: "+m1);
    }

}
