package es.uah.matcomp.mp.el1.practica4.Ejercicio6;

public class Dog extends Animal{
    public Dog (String name){
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooof");
    }
    public void greets(Dog another){
        System.out.println("WOOOOOOOOOOOF");
    }
}
