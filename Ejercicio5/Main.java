package Práctica1.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        InvoiceItem c1 = new InvoiceItem("Pen red", "A101");
        c1.setQty(999);
        c1.setUnitprice(0.99);

        System.out.println(c1.toString());
        System.out.println("    -El id es " + c1.getId());
        System.out.println("    -Desc es "+ c1.getDesc());
        System.out.println("    -Unitprice is "+ c1.getUnitprice());
        System.out.println("    -El total es " + c1.gettotal());

    }
}