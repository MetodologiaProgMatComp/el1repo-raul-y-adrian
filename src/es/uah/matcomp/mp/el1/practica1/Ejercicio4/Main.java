package es.uah.matcomp.mp.el1.practica1.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Empleado c1= new Empleado("Raul", "Muñoz",9085451);
        c1.setSalary(1000);

        System.out.println("Las caracteristicas de nuestro empleado son: ");
        System.out.println("1. Numero de identidad ---> "+ c1.getId());
        System.out.println("2. " + c1.getFirstname());
        System.out.println("3. "+ c1.getLastname());
        System.out.println("4. Nombre completo ---> "+ c1.getFullName());
        System.out.println("5. Salario cada mes ---> " + c1.getSalary());
        System.out.println("6. Salario anual ---> " + c1.getAnnualSalary());
        System.out.println(("7. Incremento de salario ---> "+ c1.raiseSalary(10) ));
    }
}
