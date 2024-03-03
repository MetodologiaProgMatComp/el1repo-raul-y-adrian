package es.uah.matcomp.mp.el1.practica3.Ejercicio6;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void Animal(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Animal:" + "Animal[" +
                "name=" + name +"]";
    }
}
