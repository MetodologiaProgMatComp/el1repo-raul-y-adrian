package es.uah.matcomp.mp.el1.practica1.Ejercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date c1=new Date(13,5,2005);

    @Test
    void getDay() {
        assertEquals(13, c1.getDay());
    }

    @Test
    void getMonth() {
        assertEquals(5,c1.getMonth());
    }

    @Test
    void getYear() {
        assertEquals(2005, c1.getYear());
    }

    //los set necesitarian un return para poder incluir el test, sin embargo el enunciado del ejercicio nos dice que utilicemos void
    @Test
    void setDay() {
    }

    @Test
    void setMonth() {
    }

    @Test
    void setYear() {
    }

    @Test
    void setdate() {
    }

    @Test
    void testToString() {
        assertEquals("dateej7{" +
                "day=" + c1.getDay() +
                ", month=" + c1.getMonth() +
                ", year=" + c1.getYear() +
                '}', c1.toString());
    }
}