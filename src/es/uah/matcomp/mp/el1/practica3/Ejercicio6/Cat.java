package es.uah.matcomp.mp.el1.practica3.Ejercicio6;

public class Cat extends Mammal{

    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("MEOW");
    }

    @Override
    public String toString() {
        return "Cat[Mamal[Animal[name="+this.name+"]]]";
    }
}
