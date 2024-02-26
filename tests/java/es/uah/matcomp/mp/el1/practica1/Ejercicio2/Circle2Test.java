package es.uah.matcomp.mp.el1.practica1.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {
    Circle c1 = new Circle(3);
    @Test
    void getRadius() {
        assertEquals(3,c1.getRadius());
    }

    @Test
    void setRadius() {
        assertEquals(3,c1.getRadius());

    }

    @Test
    void getArea() {
        assertEquals(c1.getRadius()*c1.getRadius()*Math.PI,c1.getArea());

    }

    @Test
    void getCircumference() {
        assertEquals(2*c1.getRadius()*Math.PI,c1.getCircumference());

    }

    @Test
    void testToString() {
        assertEquals("Circle{" +
                "radius=" + c1.getRadius() +
                '}',c1.toString());

    }
}