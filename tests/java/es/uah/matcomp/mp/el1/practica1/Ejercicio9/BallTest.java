package es.uah.matcomp.mp.el1.Ejercicio9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    Ball c1 = new Ball(10, 20, 3, 30, 40);
    @Test
    void getX() {
        assertEquals(10, c1.getX());
    }

    @Test
    void setX() {
        c1.setX(15);
        assertEquals(15, c1.getX());
    }

    @Test
    void getY() {
        assertEquals(20, c1.getY());
    }

    @Test
    void setY() {
        c1.setY(50);
        assertEquals(50, c1.getY());
    }

    @Test
    void getRadius() {
        assertEquals(3, c1.getRadius());
    }

    @Test
    void setRadius() {
        c1.setRadius(100);
        assertEquals(100, c1.getRadius());
    }

    @Test
    void getXDelta() {
        assertEquals(30,
                c1.getXDelta());
    }

    @Test
    void setXDelta() {
        c1.setXDelta(45);
        assertEquals(45, c1.getXDelta());
    }

    @Test
    void getYDelta() {
        assertEquals(40, c1.getYDelta());
    }

    @Test
    void setYDelta() {
        c1.setYDelta(33);
        assertEquals(33, c1.getYDelta());
    }

    @Test
    void move() {
        float esperado;
        esperado=c1.getX()+c1.getXDelta();
        c1.move();
        assertEquals(esperado,c1.getX());
    }

    @Test
    void reflectHorizontal() {
        float esperado;
        esperado=-c1.getXDelta();
        c1.reflectHorizontal();
        assertEquals(esperado,c1.getXDelta());
    }

    @Test
    void reflectVertical() {
        float esperado;
        esperado=-c1.getYDelta();
        c1.reflectVertical();
        assertEquals(esperado,c1.getYDelta());
    }

    @Test
    void testToString() {
        assertEquals("Ball[" +
                "(X: " + c1.getX() +
                "Y: )" + c1.getY() +
                " speed=" +
                c1.getXDelta() +
                c1.getYDelta() +
                ']',c1.toString());
    }
}