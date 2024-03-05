package es.uah.matcomp.mp.el1.practica4.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle=new Rectangle(2,3);

    @Test
    void testToString() {
        assertEquals("Rectangle[length=3.0, width=2.0]",rectangle.toString());
    }

    @Test
    void getArea() {
        assertEquals(6, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(10, rectangle.getPerimeter());
    }
}