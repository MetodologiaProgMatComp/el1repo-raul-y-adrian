package es.uah.matcomp.mp.el1.practica3.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student estudiante=new Student("Pepe","1234","Programa",2000,1250);
    @Test
    void getProgram() {
        assertEquals("Programa",estudiante.getProgram());
    }

    @Test
    void setProgram() {
        estudiante.setProgram("OtroPrograma");
        assertEquals("OtroPrograma",estudiante.getProgram());
    }

    @Test
    void getYear() {
        assertEquals(2000,estudiante.getYear());
    }

    @Test
    void setYear() {
        estudiante.setYear(2002);
        assertEquals(2002,estudiante.getYear());
        }

    @Test
    void getFee() {
        assertEquals(1250,estudiante.getFee());
    }

    @Test
    void setFee() {
        estudiante.setFee(20000);
        assertEquals(20000,estudiante.getFee());
    }

    @Test
    void testToString() {
        assertEquals("Student[Person["+ estudiante.getName()+"," +estudiante.getAddress()+"]" +
                "program='" + estudiante.getProgram() + '\'' +
                ", year=" + estudiante.getYear() +
                ", fee=" + estudiante.getFee() +
                ']',estudiante.toString());
    }
}