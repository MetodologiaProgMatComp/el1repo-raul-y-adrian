package es.uah.matcomp.mp.el1.practica3.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point point=new Point();

    @Test
    void getX() {
        assertEquals(0.0f, point.getX());
    }

    @Test
    void setX() {
        point.setX(1);
        assertEquals(1, point.getX());
    }

    @Test
    void getY() {
        assertEquals(0.0f, point.getY());
    }

    @Test
    void setY() {
        point.setY(12);
        assertEquals(12, point.getY());
    }

    @Test
    void getXY() {
        assertEquals(0.0f, point.getXY()[0]);
        assertEquals(0.0f, point.getXY()[1]);
    }

    @Test
    void setXY() {
        point.setXY(1,4);
        assertEquals(1,point.getXY()[0]);
        assertEquals(4, point.getXY()[1]);
    }

    @Test
    void testToString() {
        assertEquals("(0.0,0.0)",point.toString());
    }
}