package es.uah.matcomp.mp.el1.practica2.Ejercicio8;

import es.uah.matcomp.mp.el1.practica2.Ejercicio6.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    MyCircle circulo = new MyCircle(1,1,4);
    @Test
    void getRadius() {
        assertEquals(4,circulo.getRadius());
    }

    @Test
    void setRadius() {
        circulo.setRadius(5);
        assertEquals(5,circulo.getRadius());

    }

    @Test
    void getCenter() {
        assertEquals("(1,1)",circulo.getCenter().toString());
    }

    @Test
    void setCenter() {
        circulo.setCenter(new MyPoint(12,12));
        assertEquals("(12,12)",circulo.getCenter().toString());
    }

    @Test
    void getCenterX() {
        assertEquals(1,circulo.getCenterX());

    }

    @Test
    void setCenterX() {
        circulo.setCenterX(2);
        assertEquals(2,circulo.getCenterX());

    }

    @Test
    void getCenterY() {
        assertEquals(1,circulo.getCenterY());

    }

    @Test
    void setCenterY() {
        circulo.setCenterY(2);
        assertEquals(2,circulo.getCenterY());
    }

    @Test
    void getCenterXY() {
        assertEquals(1,circulo.getCenterXY()[0]);
        assertEquals(1,circulo.getCenterXY()[1]);

    }

    @Test
    void setCenterXY() {
        circulo.setCenterXY(12,12);
        assertEquals(12,circulo.getCenterXY()[0]);
        assertEquals(12,circulo.getCenterXY()[1]);
    }

    @Test
    void testToString() {
        assertEquals("MyCircle{" + "center=" + circulo.center.toString() + ", radius=" + circulo.getRadius() + '}',circulo.toString());
    }

    @Test
    void getArea() {
    }

    @Test
    void getCincurference() {
    }

    @Test
    void distance() {
    }
}