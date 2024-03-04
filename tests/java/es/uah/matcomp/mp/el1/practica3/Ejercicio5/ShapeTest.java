package es.uah.matcomp.mp.el1.practica3.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape shape=new Shape();

    @Test
    void getColor() {
        assertEquals("red", shape.getColor());
    }

    @Test
    void setColor() {
        shape.setColor("black");
        assertEquals("black", shape.getColor());
    }

    @Test
    void isFilled() {
        assertEquals(true, shape.isFilled());
    }

    @Test
    void setFilled() {
        shape.setFilled(false);
        assertEquals(false, shape.isFilled());
    }

    @Test
    void testToString() {
        assertEquals("Shape{color='red', filled=true}",shape.toString());
    }
}