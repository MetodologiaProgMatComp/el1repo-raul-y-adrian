package Práctica1.Ejercicio6;

import Práctica1.Ejercicio6.Account;

public class Main {
    public static void main(String[] args) {
        //llamar a la clase funciones para traes los metodos
        Account c1 = new Account("1", "Raul", 500);
        Account c2 = new Account("2","Arana", 10000);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c1.debit(100);
        c1.credito(200);
        //Para transferir
        c2.credito(c1.transfer(100));

        System.out.println(("dinero de " +c1.name + " tras la transacción a " + c2.getName() +
                " es de " + c1.getBalance() +"€, y el balance de " + c2.getName() + " tras la transacción es de " + c2.getBalance() + "€."));

    }
}