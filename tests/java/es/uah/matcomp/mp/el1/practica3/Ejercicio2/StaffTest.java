package es.uah.matcomp.mp.el1.practica3.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    Staff staffPrueba = new Staff("Pepe","1234","Complutense",1000);

    @Test
    void getSchool() {
        assertEquals("Complutense",staffPrueba.getSchool());
    }

    @Test
    void setSchool() {
        staffPrueba.setSchool("OtraEscuela");
        assertEquals("OtraEscuela",staffPrueba.getSchool());

    }

    @Test
    void getPay() {
        assertEquals(1000,staffPrueba.getPay());
    }

    @Test
    void setPay() {
        staffPrueba.setPay(2000);
        assertEquals(2000,staffPrueba.getPay());
        }

    @Test
    void testToString() {
        assertEquals("Staff{Person[" + staffPrueba.getName() + "," + staffPrueba.getAddress() + "]" +
                "school='" + staffPrueba.getSchool() + '\'' +
                ", pay=" + staffPrueba.getPay() +
                '}',staffPrueba.toString());
    }
}