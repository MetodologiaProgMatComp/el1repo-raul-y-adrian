package es.uah.matcomp.mp.el1.practica3.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog=new Dog("Pepe");

    @Test
    void testToString() {
        dog.greets();
    }
}