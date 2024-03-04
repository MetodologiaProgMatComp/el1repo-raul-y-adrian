package es.uah.matcomp.mp.el1.practica3.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animal=new Animal("Joselu");

    @Test
    void testToString() {
        assertEquals("Animal[name=Joselu]", animal.toString());
    }
}