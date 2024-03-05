package es.uah.matcomp.mp.el1.practica4.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1=new Circle(12);
    @Test
    void getRadius() {
        assertEquals(12,c1.getRadius());
    }

    @Test
    void setRadius() {
        c1.setRadius(20);
        assertEquals(20,c1.getRadius());

    }

    @Test
    void getArea() {
        assertEquals(12*12*Math.PI,c1.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(12*2*Math.PI,c1.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Circle[Shape[color="+c1.getColor() +
                ", filled="+c1.isFilled()+"],radius=" + c1.getRadius() +
                ']',c1.toString());
    }
}