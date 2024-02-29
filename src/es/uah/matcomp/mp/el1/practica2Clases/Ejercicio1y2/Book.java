package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio1;

import java.util.Arrays;

public class Book {
    private String name;

    private  double price;
    private Author[] authors;

    private int qty;


    //Constructor 2, con cantidad

    public Book(String name,double price, Author[] authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public Book(String name, double price, Author[] authors, int qty) {
        this.name = name;
        this.price = price;
        this.authors = authors;
        this.qty = qty;
    }

    public Book(String javaForDummy, int price, String cdvfbgn, int qty) {
    }


    public Author[] getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name= " + name + '\'' +
                ", price=" + price +
                ", authors=" + Arrays.toString(authors) +
                ", qty=" + qty +
                '}';
    }
    public String getAuthorNames(){
        String nombre0= authors[0].getName();
        String nombre1= authors[1].getName();

        return "Los nombres son: " +nombre0+" y "+nombre1;
    }
}
