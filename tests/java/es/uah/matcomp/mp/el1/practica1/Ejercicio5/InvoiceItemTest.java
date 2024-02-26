package es.uah.matcomp.mp.el1.practica1.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {
    InvoiceItem i1 = new InvoiceItem("15", "1");
    @Test
    void getId() {
        assertEquals("1",i1.getId());
    }

    @Test
    void getDesc() {
        assertEquals("15",i1.getDesc());
    }
    @Test
    void setQty() {
        i1.setQty(100);
        assertEquals(100,i1.getQty());
    }
    @Test
    void getQty() {
        assertEquals(100,i1.getQty());
    }

    @Test
    void setUnitprice() {
        i1.setUnitprice(20);
        assertEquals(20,i1.getUnitprice());
    }

    @Test
    void getUnitprice() {
        assertEquals(20,i1.getUnitprice());
    }


    @Test
    void gettotal() {
        assertEquals(i1.getUnitprice()*i1.getQty(),i1.gettotal());
    }

    @Test
    void testToString() {
        assertEquals(("InvoiceItem{" +
                "id='" + i1.getId() + '\'' +
                ", desc='" + i1.getDesc() + '\'' +
                ", qty=" + i1.getQty() +
                ", unitprice=" + i1.getUnitprice() +
                '}'),i1.toString());
    }
}