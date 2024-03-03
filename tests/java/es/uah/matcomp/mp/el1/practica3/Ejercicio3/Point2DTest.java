package es.uah.matcomp.mp.el1.practica3.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    Point2D punto2d=new Point2D(10,10);
    @Test
    void getX() {
        assertEquals(10,punto2d.getX());
    }

    @Test
    void setX() {
        punto2d.setX(100);
        assertEquals(100,punto2d.getX());
    }

    @Test
    void getY() {
        assertEquals(10,punto2d.getY());
    }

    @Test
    void setY() {
        punto2d.setY(100);
        assertEquals(100,punto2d.getY());
    }

    @Test
    void getXY() {
        assertEquals(10,punto2d.getXY()[0]);
        assertEquals(10,punto2d.getXY()[1]);
    }

    @Test
    void setXY() {
        punto2d.setXY(1000,1000);
        assertEquals(1000,punto2d.getXY()[0]);
    }

    @Test
    void testToString() {
        assertEquals("(" +
                punto2d.getX() +
                "," + punto2d.getY() +
                ')',punto2d.toString());
    }
}