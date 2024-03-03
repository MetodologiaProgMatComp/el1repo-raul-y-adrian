package es.uah.matcomp.mp.el1.practica3.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {
    Mammal mammal=new Mammal("Pab");

    @Test
    void testToString() {
        assertEquals("Mamal[Animal[name=Pab]]",mammal.toString());
    }
}