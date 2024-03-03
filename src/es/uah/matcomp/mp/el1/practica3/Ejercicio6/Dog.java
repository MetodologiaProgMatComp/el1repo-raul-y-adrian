package es.uah.matcomp.mp.el1.practica3.Ejercicio6;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("GUAU");
    }
    public  void greets(Dog another){
        System.out.println("WOOOOOOF");
    }

    @Override
    public String toString() {
        return "Dog[Mamal[Animal[name="+this.name+"]]]";
    }
}
