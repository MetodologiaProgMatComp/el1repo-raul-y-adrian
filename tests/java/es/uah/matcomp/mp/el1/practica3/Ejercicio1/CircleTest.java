package es.uah.matcomp.mp.el1.practica3.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle=new Circle(5,"Red");
    @Test
    void getRadius() {
        assertEquals(5,circle.getRadius());
    }

    @Test
    void setRadius() {
        circle.setRadius(120);
        assertEquals(120,circle.getRadius());
    }

    @Test
    void getColor() {
        assertEquals("Red",circle.getColor());
    }

    @Test
    void setColor() {
        circle.setColor("Blue");
        assertEquals("Blue",circle.getColor());
    }

    @Test
    void getArea() {
        assertEquals(25*Math.PI,circle.getArea());
    }

    @Test
    void testToString() {
        assertEquals("Circle[" +
                "radius=" + circle.getRadius() +
                ", color='" + circle.getColor() + '\'' +
                ']',circle.toString());
    }
}