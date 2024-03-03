package es.uah.matcomp.mp.el1.practica3.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person persona = new Person("Pepe","123");

    @Test
    void getName() {
        assertEquals("Pepe",persona.getName());
    }

    @Test
    void getAddress() {
        assertEquals("123",persona.getAddress());
    }

    @Test
    void setAddress() {
        persona.setAddress("1111");
        assertEquals("1111",persona.getAddress());
    }

    @Test
    void testToString() {
        assertEquals("Person[" +
                "name='" + persona.getName() + '\'' +
                ", address='" + persona.getAddress() + '\'' +
                ']',persona.toString());
    }
}