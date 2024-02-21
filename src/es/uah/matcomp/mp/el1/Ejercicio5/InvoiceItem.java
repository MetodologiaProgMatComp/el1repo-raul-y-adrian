package es.uah.matcomp.mp.el1.Ejercicio5;

public class InvoiceItem {
    private String id;
    private String desc;
    private  int qty;
    private  double unitprice;

    public InvoiceItem(String desc, String id) {
        this.desc = desc;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    public double gettotal(){
        return unitprice*qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitprice=" + unitprice +
                '}';
    }
}