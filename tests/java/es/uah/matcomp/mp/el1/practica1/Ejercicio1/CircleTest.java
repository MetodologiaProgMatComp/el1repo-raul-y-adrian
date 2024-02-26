package es.uah.matcomp.mp.el1.practica1.Ejercicio1;

import es.uah.matcomp.mp.el1.practica1.Ejercicio1.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle(2);
    @Test
    void getRadius() {
            assertEquals(2,c1.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(2*2*Math.PI,c1.getArea());
    }
}