package es.uah.matcomp.mp.el1.practica2.Ejercicio5;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+"("+id+")";
    }

    public char getGender() {
        return gender;
    }
}
