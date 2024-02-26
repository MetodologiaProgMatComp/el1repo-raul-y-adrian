package es.uah.matcomp.mp.el1.Ejercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    Time c1=new Time(19,16,35);
    @Test
    void getHour() {
        assertEquals(19, c1.getHour());
    }

    @Test
    void getMinute() {
        assertEquals(16,c1.getMinute() );
    }

    @Test
    void getSecond() {
        assertEquals(35, c1.getSecond());
    }

    @Test
    void setHour() {
    }

    @Test
    void setMinute() {
    }

    @Test
    void setSecond() {
    }

    @Test
    void setTime() {
    }

    @Test
    void testToString() {
        assertEquals("["+c1.getHour() +
                ":" + c1.getMinute() +
                ":" + c1.getSecond() +
                ']', c1.toString());
    }


    //IMPORTANTE PONER EL TOSTRING DEL FINAL PARA QUE FUNCIONE EL TEST CON LOS CORCHETES
    @Test
    void nextSecond() {
        assertEquals("[19:16:36]", c1.nextSecond().toString());
    }

    @Test
    void previousSecond() {
        assertEquals("[19:16:34]", c1.previousSecond().toString());
    }
}