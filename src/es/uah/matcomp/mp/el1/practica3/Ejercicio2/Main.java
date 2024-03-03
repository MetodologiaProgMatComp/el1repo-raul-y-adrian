package es.uah.matcomp.mp.el1.practica3.Ejercicio2;

public class Main {
    public static void main(String[] args){
        Student student1=new Student("Raul", "Avenida del paraiso", "Mate", 2005, 100);


        System.out.println(student1.getName()+student1.getAddress()+student1.getProgram()+student1.getYear()+student1.getFee());

        System.out.println(student1.toString());
        student1.setFee(300);
        System.out.println(student1.getFee());
        student1.setYear(2007);
        System.out.println(student1.getYear());

        Staff staff1=new Staff("Arana", "Calle lol", "Lope de Vega", 500);
        System.out.println(staff1.getName()+staff1.getAddress()+staff1.getSchool()+staff1.getPay());
        System.out.println(staff1.toString());
        staff1.setPay(80000000);
        System.out.println(staff1.getPay());
    }
}
