package es.uah.matcomp.mp.el1.practica4.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    ResizableCircle rc1=new ResizableCircle(12);
    @Test
    void resize() {
        rc1.resize(50);
        assertEquals(6*6*Math.PI,rc1.getArea());
    }

    @Test
    void testToString() {
        assertEquals("ResizableCircle[Circle[" +
                "radius=" + rc1.radius +
                "]]",rc1.toString());
    }
}