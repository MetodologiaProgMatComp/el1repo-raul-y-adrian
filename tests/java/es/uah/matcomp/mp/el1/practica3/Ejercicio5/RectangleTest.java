package es.uah.matcomp.mp.el1.practica3.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle=new Rectangle();

    @Test
    void getLength() {
        assertEquals(1, rectangle.getLength());
    }

    @Test
    void getWidth() {
        assertEquals(1,rectangle.getWidth());
    }

    @Test
    void setLength() {
        rectangle.setLength(21);
        assertEquals(21, rectangle.getLength());
    }

    @Test
    void setWidth() {
        rectangle.setWidth(23);
        assertEquals(23,rectangle.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(1, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(4, rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Rectangle[Shape[color=null,filled=false],length=1.0, width=1.0]", rectangle.toString());
    }
}