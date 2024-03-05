package es.uah.matcomp.mp.el1.practica4.Ejercicio1;

import org.junit.jupiter.api.Test;

import java.sql.SQLRecoverableException;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r1=new Rectangle(10,20);
    @Test
    void getLength() {
        assertEquals(10,r1.getLength());
    }

    @Test
    void getWidth() {
        r1.setWidth(20);
        assertEquals(20,r1.getWidth());
    }

    @Test
    void setLength() {
        r1.setLength(30);
        assertEquals(30,r1.getLength());
    }

    @Test
    void setWidth() {
        r1.setWidth(50);
        assertEquals(50,r1.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(20*10,r1.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(400,r1.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Rectangle[Shape[color=" + r1.getColor()+",filled="+r1.isFilled()+
                "],length=" + r1.getLength() +
                ", width=" + r1.getWidth() +
                ']',r1.toString());
    }
}