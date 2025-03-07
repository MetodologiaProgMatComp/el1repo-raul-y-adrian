package es.uah.matcomp.mp.el1.practica2.Ejercicio1y2;

public class Author {
    private String name;

    private  String email;

    private  char gender;

    //Constructor

    public Author (String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
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
