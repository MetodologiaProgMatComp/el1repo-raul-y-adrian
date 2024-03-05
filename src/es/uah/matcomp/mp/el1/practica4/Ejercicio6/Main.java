package es.uah.matcomp.mp.el1.practica4.Ejercicio6;

public class Main {
    public static void main(String[] args){
        Cat cat=new Cat("Hola");

        cat.greets();

        Dog dog=new Dog("Paco");
        dog.greets(dog);
        Dog dog1=new Dog("sd");
        dog1.greets(dog1);

        BigDog dog2=new BigDog("sdcv");
        dog2.greets(dog2);
    }
}
