package es.uah.matcomp.mp.el1.practica4.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c2=new Circle(10);
    @Test
    void getPerimeter() {
        assertEquals(10*Math.PI*2,c2.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(10*Math.PI*10,c2.getArea());
    }
}