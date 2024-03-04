package es.uah.matcomp.mp.el1.practica3.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint c1=new MovablePoint();

    @Test
    void getxSpeed() {
        assertEquals(0.0f, c1.getxSpeed());
    }

    @Test
    void setxSpeed() {
        c1.setxSpeed(2);
        assertEquals(2, c1.getxSpeed());
    }

    @Test
    void getySpeed() {
        assertEquals(0.0f, c1.getySpeed());
    }
    @Test
    void setySpeed() {
        c1.setySpeed(12);
        assertEquals(12, c1.getySpeed());
    }

    @Test
    void getSpeed() {
        assertEquals(0.0f, c1.getSpeed()[0]);
        assertEquals(0.0f, c1.getSpeed()[1]);
    }

    @Test
    void setSpeed() {
        c1.setSpeed(12,21);
        assertEquals(12, c1.getSpeed()[0]);
        assertEquals(21, c1.getSpeed()[1]);

    }

    @Test
    void testToString() {
        assertEquals("(0.0,0.0),Speed=(0.0,0.0)", c1.toString());
    }

    @Test
    void move() {
        c1.setSpeed(2,2);
        c1.setXY(3,4);
        assertEquals(3.0f, c1.move().getXY()[0]);
        assertEquals(4.0f, c1.move().getXY()[1]);
        assertEquals(2.0f, c1.move().getxSpeed());
        assertEquals(2.0f, c1.move().getySpeed());    }
}