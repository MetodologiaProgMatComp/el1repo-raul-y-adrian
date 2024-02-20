package Práctica1.Ejercicio4;

public class Funciones {
    //VARIABLES
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    //CONSTRUCTORES
    // public ejercicio4.funciones(String firstname, String lastname, int id, int salary) {
    // this.firstname = firstname;
    //this.lastname = lastname;
    //this.id=id;
    //this.salary=salary;
    //}

    ///constructor cuyos valores de las variables se incluiran en el main al nombrar a la funcion main
    public Funciones(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id=id;
    }

    //FUNCIONES
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFullName() {
        return firstname +" " + lastname;
    }

    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getAnnualSalary()
    {
        return salary * 12;
    }

    public int raiseSalary(int percentage) {
        return (int) (salary + (salary * percentage / 100.0));
    }


    public String toString() {
        return "ejercicio4.funciones{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
