package es.uah.matcomp.mp.el1.practica4.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint c1=new MovablePoint(1,2,3,2);

    @Test
    void testToString() {
        assertEquals("(1,2),speed=(3,2)",c1.toString());
    }

    @Test
    void moveUp() {
        c1.moveUp();
        assertEquals(4,c1.y);
    }

    @Test
    void moveDown() {
        c1.moveDown();
        assertEquals(0,c1.y);
    }

    @Test
    void moveLeft() {
        c1.moveLeft();
        assertEquals(-2,c1.x);
    }

    @Test
    void moveRight() {
        c1.moveRight();
        assertEquals(4, c1.x);
    }
}