package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio1;

public class Author {
    private String name;

    private  String email;

    private  char gender;

    //Constructor

    public Author (String n, String e, char g){
        this.name=n;
        this.email=e;
        this.gender=g;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name  +
                ", email=" + email +
                ", gender=" + gender +
                ']';
    }
}
