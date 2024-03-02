package es.uah.matcomp.mp.el1.practica2.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer=new Customer(123, "Arana", 'm');

    @Test
    void getId() {
        assertEquals(123, customer.getId());
    }

    @Test
    void getName() {
        assertEquals("Arana", customer.getName());
    }

    @Test
    void testToString() {
        assertEquals("Arana(123)", customer.toString());
    }

    @Test
    void getGender() {
        assertEquals('m', customer.getGender());
    }
}