package es.uah.matcomp.mp.el1.practica2.Ejercicio9;

public class Main {
    public static void main(String[] args){
        //Creamos un triangulo de prueba usando uno de los 2 constructores
        MyTriangle triangulo=new MyTriangle(1,1,2,2,3,3);
        //Pruebas para las funciones del triangulo
        System.out.println("Las cualidades del tirangulo (toString()) son: "+triangulo.toString());
        System.out.println("El perimetro del triangulo es: "+triangulo.getPerimeter());
        System.out.println("Es un triangulo de tipo: '"+triangulo.getType()+"'");
    }

}
