package es.uah.matcomp.mp.el1.practica4.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint p1 = new MovablePoint(0, 0, 1, 1);

    @Test
    void testToString() {
        assertEquals("(" + 0 + "," + 0 + "),speed=(" + 1 + "," + 1 + ")", p1.toString());
    }

    @Test
    void moveUp() {
        p1.moveUp();
        assertEquals("(" + 0 + "," + 1 + "),speed=(" + 1 + "," + 1 + ")",p1.toString());
    }

    @Test
    void moveDown() {
        p1.moveDown();
        assertEquals("(" + 0 + "," + -1 + "),speed=(" + 1 + "," + 1 + ")",p1.toString());
    }

    @Test
    void moveLeft() {
        p1.moveLeft();
        assertEquals("(" + -1 + "," + 0 + "),speed=(" + 1 + "," + 1 + ")",p1.toString());
    }

    @Test
    void moveRight() {
        p1.moveRight();
        assertEquals("(" + 1 + "," + 0 + "),speed=(" + 1 + "," + 1 + ")",p1.toString());
    }
}