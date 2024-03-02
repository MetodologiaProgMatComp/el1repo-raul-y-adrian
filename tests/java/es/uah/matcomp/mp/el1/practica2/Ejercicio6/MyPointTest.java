package es.uah.matcomp.mp.el1.practica2.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    MyPoint punto= new MyPoint(9,7);


    @Test
    void getX() {
        assertEquals(9,punto.getX());
    }

    @Test
    void setX() {
        punto.setX(111);
        assertEquals(111,punto.getX());
    }

    @Test
    void getY() {
        assertEquals(7,punto.getY());

    }

    @Test
    void setY() {
        punto.setY(222);
        assertEquals(222,punto.getY());
    }

    @Test
    void getXY() {
        int coordenadas[]=new int[2];
        coordenadas[0]=9;
        coordenadas[1]=7;
        assertEquals(coordenadas[0],punto.getXY()[0]);
        assertEquals(coordenadas[1],punto.getXY()[1]);
    }

    @Test
    void setXY() {
        punto.setXY(10,10);
        int coordenadas[]=new int[2];
        coordenadas[0]=10;
        coordenadas[1]=10;
        assertEquals(coordenadas[0], punto.getXY()[0]);
        assertEquals(coordenadas[1],punto.getXY()[1]);
    }

    @Test
    void testToString() {
        assertEquals("(" +
                "9" +
                "," + "7" +
                ')',punto.toString());
    }

    @Test
    void testDistance1() {
        MyPoint punto2=new MyPoint(1,1);
        assertEquals(10,punto.distance(punto2));
    }

    @Test
    void testDistance2() {
        MyPoint punto3=new MyPoint(6,8);
        assertEquals(10,punto3.distance());
    }

    @Test
    void testDistance3() {
        MyPoint punto4=new MyPoint(9,9);
        assertEquals(10,punto4.distance(3,1));
    }
}