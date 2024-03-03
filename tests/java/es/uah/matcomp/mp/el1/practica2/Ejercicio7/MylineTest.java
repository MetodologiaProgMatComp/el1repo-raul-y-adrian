package es.uah.matcomp.mp.el1.practica2.Ejercicio7;

import es.uah.matcomp.mp.el1.practica2.Ejercicio6.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MylineTest {
    Myline linea1 = new Myline(1, 1, 2, 2);

    @Test
    void getBegin() {
        MyPoint puntoEsperado = new MyPoint(1, 1);
        assertEquals(puntoEsperado.toString(), linea1.getBegin().toString());
    }

    @Test
    void setBegin() {
        MyPoint puntoInicio = new MyPoint(10, 10);
        linea1.setBegin(puntoInicio);
        assertEquals(puntoInicio.toString(), linea1.getBegin().toString());
    }

    @Test
    void getEnd() {
        MyPoint puntoEsperado = new MyPoint(2, 2);
        assertEquals(puntoEsperado.toString(), linea1.getEnd().toString());
    }

    @Test
    void setEnd() {
        MyPoint puntoFinal = new MyPoint(20, 20);
        linea1.setEnd(puntoFinal);
        assertEquals(puntoFinal.toString(), linea1.getEnd().toString());
    }

    @Test
    void getBeginX() {
        assertEquals(1, linea1.getBeginX());
    }

    @Test
    void setBeginX() {
        linea1.setBeginX(3);
        assertEquals(3, linea1.getBeginX());
    }

    @Test
    void getBeginY() {
        assertEquals(1, linea1.getBeginY());
    }

    @Test
    void setBeginY() {
        linea1.setBeginY(5);
        assertEquals(5, linea1.getBeginX());

    }

    @Test
    void getEndX() {
        assertEquals(2, linea1.getEndX());
    }

    @Test
    void setEndX() {
        linea1.setEndX(5);
        assertEquals(5, linea1.getBeginX());
    }

    @Test
    void getEndY() {
        assertEquals(2, linea1.getEndY());
    }

    @Test
    void setEndY() {
        linea1.setEndY(12);
        assertEquals(12, linea1.getEndY());
    }

    @Test
    void getBeginXY() {
        int datos[] = new int[2];
        datos[0] = 1;
        datos[1] = 1;
        assertEquals(datos[0], linea1.getBeginXY()[0]);
        assertEquals(datos[1], linea1.getBeginXY()[1]);
    }

    @Test
    void setBeginXY() {
        int datos[] = new int[2];
        datos[0] = 9;
        datos[1] = 9;
        linea1.setBeginXY(9, 9);
        assertEquals(datos[0], linea1.getBeginXY()[0]);
        assertEquals(datos[1], linea1.getBeginXY()[1]);
    }

    @Test
    void getEndXY() {
        int datos[] = new int[2];
        datos[0] = 2;
        datos[1] = 2;
        assertEquals(datos[0], linea1.getEndXY()[0]);
        assertEquals(datos[1], linea1.getEndXY()[1]);
    }

    @Test
    void setEndXY() {
        int datos[] = new int[2];
        datos[0] = 8;
        datos[1] = 8;
        linea1.setEndXY(8, 8);
        assertEquals(datos[0], linea1.getEndXY()[0]);
        assertEquals(datos[1], linea1.getEndXY()[1]);
    }

    @Test
    void getLength() {
        assertEquals(Math.sqrt(2),linea1.getLength());
    }

    @Test
    void getGradient() {
        assertEquals(Math.atan2(1,1),linea1.getGradient());
    }
    @Test
    void testToString() {
        assertEquals("Myline{" +
                "begin=" + linea1.getBegin() +
                ", end=" + linea1.getEnd() +
                '}',linea1.toString());
    }
}