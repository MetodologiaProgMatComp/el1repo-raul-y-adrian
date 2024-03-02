package es.uah.matcomp.mp.el1.practica2.Ejercicio7;

import es.uah.matcomp.mp.el1.practica2.Ejercicio6.MyPoint;

public class Main {
    public static void main(String[] args) {
        //Creamos las lineas de prueba
        Myline line1 = new Myline(1, 1, 2, 2);

        MyPoint begin = new MyPoint(1, 1);
        MyPoint end = new MyPoint(2, 2);
        Myline line2 = new Myline(begin, end);

        //Creamos el codigo de prueba para la clase
        System.out.println("Las coordenadas del inicio de linea1 son: " + line1.getBegin());
        line1.setBeginXY(3, 3);
        System.out.println("Las nuevas coordenadas del inicio de la linea1 son: " + line1.getBegin());
        System.out.println("Las coordenadas del final de linea1 son: " + line1.getEnd());
        line1.setEndXY(5, 5);
        System.out.println("Las nuevas coordenadas del final de linea1 son: " + line1.getEnd());
        System.out.println("La longitud de la linea1 es de: " + line1.getLength());
        System.out.println("El angulo de la linea1 sobre los ejes de coordenadas es: " + line1.getGradient() + " radianes.");
        System.out.println("Las cualidades (ToString()) de la linea1 son: " + line1.toString());

        System.out.println("");

        //Usando el segundo constructor
        System.out.println("Las coordenadas del inicio de linea2 son: " + line2.getBegin());
        line2.setBeginXY(30, 30);
        System.out.println("Las nuevas coordenadas del inicio de  la linea2 son: " + line2.getBegin());
        line2.setEndXY(15, 15);
        System.out.println("Las coordenadas del final de linea2 son: " + line2.getEnd());
        System.out.println("La longitud de la linea2 es de: " + line2.getLength());
        System.out.println("El angulo de la linea2 sobre los ejes de coordenadas es: " + line2.getGradient() + " radianes.");
        System.out.println("Las cualidades (ToString()) de la linea2 son: " + line2.toString());

    }
}
