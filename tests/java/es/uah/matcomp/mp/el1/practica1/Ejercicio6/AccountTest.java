package es.uah.matcomp.mp.el1.practica1.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account c1= new Account("09085451","Raul", 100 );

    @Test
    void getId() {
        assertEquals("09085451",c1.getId());
    }

    @Test
    void getName() {
        assertEquals("Raul", c1.getName());
    }

    @Test
    void getBalance() {
        assertEquals(100, c1.getBalance());
    }

    @Test
    void credito() {
        assertEquals(200, c1.credito(100));
    }

    @Test
    void debit() {
        assertEquals(50, c1.debit(50));

    }


    @Test
    void transfer() {
        assertEquals(30, c1.transfer(70));
    }
}