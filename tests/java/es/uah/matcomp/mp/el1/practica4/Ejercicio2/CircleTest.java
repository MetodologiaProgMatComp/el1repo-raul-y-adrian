package es.uah.matcomp.mp.el1.practica4.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle=new Circle(2);

    @Test
    void testToString() {
        assertEquals("Circle[radius=12.0]",circle.toString());
    }

    @Test
    void getArea() {
        assertEquals(12.566370614359172,circle.getArea());

    }

    @Test
    void getPerimeter() {
        assertEquals(12.566370614359172,circle.getPerimeter());
    }
}