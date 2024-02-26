package es.uah.matcomp.mp.el1.practica1.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r1 = new Rectangle(3,5);
    @Test
    void getLength() {
        assertEquals(3,r1.getLength());

    }

    @Test
    void getWidth() {
        assertEquals(5,r1.getWidth());

    }

    @Test
    void setLength() {
        r1.setLength(12);
        assertEquals(12,r1.getLength());

    }

    @Test
    void setWidth() {
        r1.setWidth(10);
        assertEquals(10,r1.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(r1.getLength()* r1.getWidth(),r1.getArea());

    }

    @Test
    void getPerimeter() {
        assertEquals(2*r1.getLength()+2*r1.getWidth(),r1.getPerimeter());

    }

    @Test
    void testToString() {
        assertEquals(("Rectangle{" +
                "length=" + r1.getLength() +
                ", width=" + r1.getWidth() +
                '}'),r1.toString());

    }
}