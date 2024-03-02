package es.uah.matcomp.mp.el1.practica2.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author author=new Author("Raul", "rmyelamosklk@gmail.com");

    @Test
    void getName() {
        assertEquals("Raul", author.getName());
    }

    @Test
    void getEmail() {
        assertEquals("rmyelamosklk@gmail.com", author.getEmail());
    }

    @Test
    void setEmail() {
        author.setEmail("jola");
        assertEquals("jola", author.getEmail());
    }

    @Test
    void testToString() {
        assertEquals("Author[name= Raul, email= rmyelamosklk@gmail.com]", author.toString());
    }
}