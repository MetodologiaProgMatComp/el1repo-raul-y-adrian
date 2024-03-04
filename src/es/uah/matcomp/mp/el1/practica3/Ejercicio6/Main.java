package es.uah.matcomp.mp.el1.practica3.Ejercicio6;


public class Main {
    public static void main(String[] args){
        Animal animal=new Animal("Jason");
        System.out.println(animal.toString());
        Mammal mammal=new Mammal("PACO");
        System.out.println(mammal.toString());
        Cat cat=new Cat("Hola");
        System.out.println(cat.toString());
        Dog dog=new Dog("yuuuu");
        System.out.println(dog.toString());
    }
}
