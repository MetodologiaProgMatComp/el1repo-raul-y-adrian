package es.uah.matcomp.mp.el1.practica3.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle=new Circle();

    @Test
    void getRadius() {
        assertEquals(1.0f, circle.getRadius());
    }

    @Test
    void setRadius() {
        circle.setRadius(21);
        assertEquals(21, circle.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(3.141592653589793, circle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(6.283185307179586, circle.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Circle[Shape[color=null, filled=false],radius=1.0]",circle.toString());
    }
}