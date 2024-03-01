package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio3;

import es.uah.matcomp.mp.el1.practica2Clases.Ejercicio3.Author;

public class Book {
    private String isbn;
    private  String name;
    private Author author;

    private  double price;

    private int qty=0;

    //Constructor 1
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    //Constructor 2

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }



    public String getIsbn() {
        return isbn;
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

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return this.author.getName();
    }

    @Override
    public String toString() {
        return "Book[" +
                "isbn='" + isbn +
                "´, name='" + name +
                ", author=" + author.toString() +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }


}
