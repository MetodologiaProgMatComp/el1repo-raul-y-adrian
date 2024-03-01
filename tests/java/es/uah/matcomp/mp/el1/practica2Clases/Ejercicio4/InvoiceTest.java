package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Customer customer1=new Customer(1, "Raul", 10);
    Invoice c1=new Invoice(2, customer1, 20.0);

    @Test
    void getId() {
        assertEquals(2, c1.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(customer1, c1.getCustomer());
    }

    @Test
    void setCostumer() {
        c1.setCostumer(customer1);
    }

    @Test
    void getAmount() {
        assertEquals(20.0, c1.getAmount());
    }

    @Test
    void setAmount() {
        c1.setAmount(50);
        assertEquals(50, c1.getAmount());
    }

    @Test
    void getCustomerId() {
        assertEquals(1, c1.getCustomerId());
    }

    @Test
    void getCustomerName() {
        assertEquals("Raul", c1.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        assertEquals(10, c1.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals(18,c1.getAmountAfterDiscount() );
    }
}