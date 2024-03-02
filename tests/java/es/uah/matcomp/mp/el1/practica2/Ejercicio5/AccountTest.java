package es.uah.matcomp.mp.el1.practica2.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Customer customer1=new Customer(123, "Arana", 'm');
    Account cuenta1=new Account(1234, customer1, 500);

    @Test
    void getId() {
        assertEquals(1234, cuenta1.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(customer1, cuenta1.getCustomer());
    }

    @Test
    void getBalance() {
        assertEquals(500, cuenta1.getBalance());
    }

    @Test
    void setBalance() {
        cuenta1.setBalance(800);
        assertEquals(800, cuenta1.getBalance());
    }

    @Test
    void testToString() {
        assertEquals("Arana(1234)balance=$500.0", cuenta1.toString());
    }

    @Test
    void getCustomerName() {
        assertEquals("Arana", cuenta1.getCustomerName());
    }

    @Test
    void deposit() {
        cuenta1.deposit(100);
        assertEquals(600, cuenta1.getBalance());
    }

    @Test
    void withdraw() {
        cuenta1.withdraw(100);
        assertEquals(400, cuenta1.getBalance());
    }
}