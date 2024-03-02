package es.uah.matcomp.mp.el1.practica2.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer1=new Customer(213, "Raul", 10);

    @Test
    void getId() {
        assertEquals(213, customer1.getId());
    }

    @Test
    void getName() {
        assertEquals("Raul", customer1.getName());

    }

    @Test
    void getDiscount() {
        assertEquals(10, customer1.getDiscount());
    }

    @Test
    void setDiscount() {
        customer1.setDiscount(20);
        assertEquals(20,customer1.getDiscount());
    }

    @Test
    void testToString() {
        assertEquals("name'Raul(213)(10%)", customer1.toString());
    }
}