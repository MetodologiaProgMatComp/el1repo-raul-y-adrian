package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio1;

public class Book {
    private String name;

    private  Author author;

    private  double price;

    private int qty;

    //Contructor 1, sin cantidad
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    //Constructor 2, con cantidad
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qtyGiven) {
        this.qty=qtyGiven;
    }

    public String getAuthorname(){
        return author.getName();
    }
    public String getAuthoremail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }
    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", author=" + author.toString() +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
}
