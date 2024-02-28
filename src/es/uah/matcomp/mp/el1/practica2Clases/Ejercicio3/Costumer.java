package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio3;

public class Costumer {
    private int id;
    private String name;
    private int discount;

    public Costumer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "name'" + name + "(" + id + ")" + "(" +
                discount + "%)";
    }
}
