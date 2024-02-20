package Práctica1.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        dateej7 c1 = new dateej7(13,5,2005);
        c1.setDay(13);
        c1.setMonth(5);
        c1.setYear(2005);

        System.out.println(c1.toString());
        System.out.println(c1.getDay() + "/" + c1.getMonth() + "/" + c1.getYear());
        System.out.println("Dia: " + c1.getDay());
        System.out.println("Mes: "+ c1.getMonth());
        System.out.println("Año: " + c1.getYear());

        c1.setdate(13,5,2005);
        System.out.println(c1);


    }
}