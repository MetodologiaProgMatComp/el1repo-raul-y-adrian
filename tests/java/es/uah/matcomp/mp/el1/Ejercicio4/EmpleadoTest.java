package es.uah.matcomp.mp.el1.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {
    Empleado e1 = new Empleado("Adrián","Arana",1);
    @Test
    void getId() {
        assertEquals(1,e1.getId());
    }

    @Test
    void getFirstname() {
        assertEquals("Adrián",e1.getFirstname());

    }

    @Test
    void getLastname() {
        assertEquals("Arana",e1.getLastname());

    }

    @Test
    void getFullName() {
        assertEquals((e1.getFirstname()+" "+e1.getLastname()),e1.getFullName());

    }

    @Test
    void setSalary() {
        e1.setSalary(1000);
        assertEquals(1000,e1.getSalary());
    }

    @Test
    void getSalary() {
        assertEquals(1000,e1.getSalary());

    }

    @Test
    void getAnnualSalary() {
        assertEquals(e1.getSalary()*12,e1.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        int salarioInicial = e1.getSalary();
        float porcentaje = 10;
        e1.raiseSalary(porcentaje);
        assertEquals((1+(porcentaje/100))*salarioInicial,e1.getSalary());
    }

    @Test
    void testToString() {
        assertEquals(("ejercicio4.Empleado{" +
                "id=" + e1.getId() +
                ", firstname='" + e1.getFirstname() + '\'' +
                ", lastname='" + e1.getLastname() + '\'' +
                ", salary=" + e1.getSalary() +
                '}'),e1.toString());
    }
}