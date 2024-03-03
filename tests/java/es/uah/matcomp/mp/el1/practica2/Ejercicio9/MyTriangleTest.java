package es.uah.matcomp.mp.el1.practica2.Ejercicio9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {
    MyTriangle triangulo= new MyTriangle(1,1,2,2,3,3);
    @Test
    void testToString() {
        assertEquals("MyTriangle[" +
                "v1="+"" +"(1,1)"+""+
                ", v2="+"" +"(2,2)"+
                ", v3=" + ""+ "(3,3)" +""+
                ']',triangulo.toString());
    }

    @Test
    void getPerimeter() {
        assertEquals(2*Math.sqrt(2)+Math.sqrt(8),triangulo.getPerimeter());
    }

    @Test
    void getType() {
        assertEquals("Isosceles",triangulo.getType());
    }}