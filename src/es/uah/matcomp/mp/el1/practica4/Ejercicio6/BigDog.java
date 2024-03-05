package es.uah.matcomp.mp.el1.practica4.Ejercicio6;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("wof");
    }
    public  void greets(Dog another){
        System.out.println("woooooooooof");
    }
    public void greets(BigDog another){
        System.out.println("WOOOOOOOOOOOOOOOOOOW");
    }
}
