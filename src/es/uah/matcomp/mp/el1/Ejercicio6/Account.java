package es.uah.matcomp.mp.el1.Ejercicio6;

public class Account {
    String id;
    String name;
    int balance;

    int transaccion;

    //this---> inicializar las variables con el nombre/valor que quieras darle
    //CONSTRUCTORES
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //FUNCIONES
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credito(int cantidad) {
        this.balance += cantidad;

    }

    public void debit(double cantidad) {
        if (cantidad <= getBalance()) {
            this.balance -= cantidad;

        } else {
            System.out.println("NO SALDO");
        }
    }

    ///se utiliza para ver por pantalla, click derecho,generate
    //


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int transfer(int cantidad) {
        this.balance = balance - cantidad;
        return cantidad;


    }
}