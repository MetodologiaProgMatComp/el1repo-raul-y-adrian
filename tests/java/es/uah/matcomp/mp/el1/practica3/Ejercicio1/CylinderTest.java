package es.uah.matcomp.mp.el1.practica3.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder cilindro = new Cylinder(5, 20);

    @Test
    void getHeight() {
        assertEquals(20, cilindro.getHeight());
    }

    @Test
    void getVolume() {
        assertEquals(25 * Math.PI * 20, cilindro.getVolume());

    }

    @Test
    void testToString() {
        assertEquals("Cylinder[" +
                "radius=" + 5.0 +
                ", color='" + "Red" + '\'' +
                ", height=" + 20.0 +
                ']', cilindro.toString());
    }
}