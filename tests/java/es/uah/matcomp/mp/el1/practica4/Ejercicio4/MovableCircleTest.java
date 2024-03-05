package es.uah.matcomp.mp.el1.practica4.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
    MovablePoint movablePoint=new MovablePoint(2,3,4,5);

    @Test
    void moveUp() {
        movablePoint.moveUp();
        assertEquals(8, movablePoint.y);
    }

    @Test
    void moveDown() {
        movablePoint.moveDown();
        assertEquals(12,movablePoint.y);
    }

    @Test
    void moveLeft() {
        movablePoint.moveLeft();
        assertEquals(-2,movablePoint.x);
    }

    @Test
    void moveRight() {
        movablePoint.moveRight();
        assertEquals(6, movablePoint.x);
    }
}