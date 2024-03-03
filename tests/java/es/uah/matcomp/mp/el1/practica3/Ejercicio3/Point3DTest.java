package es.uah.matcomp.mp.el1.practica3.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {
    Point3D punto3d=new Point3D(2,4,6);
    @Test
    void getZ() {
        assertEquals(6,punto3d.getZ());
    }

    @Test
    void setZ() {
        punto3d.setZ(9);
        assertEquals(9,punto3d.getZ());
    }

    @Test
    void getXYZ() {
        assertEquals(2,punto3d.getXYZ()[0]);
        assertEquals(4,punto3d.getXYZ()[1]);
        assertEquals(6,punto3d.getXYZ()[2]);
    }

    @Test
    void setXYZ() {
        punto3d.setXYZ(1,2,3);
        assertEquals(1,punto3d.getXYZ()[0]);
        assertEquals(2,punto3d.getXYZ()[1]);
        assertEquals(3,punto3d.getXYZ()[2]);
    }
}