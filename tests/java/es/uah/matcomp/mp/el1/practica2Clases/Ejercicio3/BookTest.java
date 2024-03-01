package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Author author=new Author("Raul", "raul@gmail.com");
    Book c1=new Book("Hola", "Raul", author, 100);
    @Test
    void getIsbn() {
        assertEquals("Hola", c1.getIsbn());
    }

    @Test
    void getName() {
        assertEquals("Raul", c1.getName());
    }

    @Test
    void getAuthor() {
        assertEquals("Raul", c1.getAuthorName());

    }

    @Test
    void getPrice() {
        assertEquals(100, c1.getPrice());
    }

    @Test
    void setPrice() {
        c1.setPrice(200);
        assertEquals(200, c1.getPrice());
    }

    Book c2=new Book("Hola2", "Raul2", author, 300, 100);
    @Test
    void getQty() {
        assertEquals(100, c2.getQty());
    }

    @Test
    void setQty() {
        c2.setQty(400);
        assertEquals(400, c2.getQty());
    }

    @Test
    void getAuthorName() {
        assertEquals("Raul", c2.getAuthorName());
    }

    @Test
    void testToString() {
        assertEquals("Book[isbn='Hola2´, name='Raul2, author=Author[name= Raul, email= raul@gmail.com], price=300.0, qty=100]", c2.toString());
    }
}