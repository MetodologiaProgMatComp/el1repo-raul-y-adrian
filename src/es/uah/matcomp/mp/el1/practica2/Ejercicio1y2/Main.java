package es.uah.matcomp.mp.el1.practica2.Ejercicio1y2;

public class Main {
    public static void main(String[] args) {
        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author's toString()
        Book dummyBook = new Book("Java for dummy", 21345, "cdvfbgn", 99); // Test Book's Constructor
        System.out.println(dummyBook); // Test Book's toString()
        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        Author[] authors = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
// Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", 19.99, authors, 99);
        System.out.println(javaDummy);
        System.out.println(javaDummy.getAuthorNames());
        }

}
