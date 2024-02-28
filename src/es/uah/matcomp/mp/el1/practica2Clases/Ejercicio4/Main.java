package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(3456789, "Arana", 'm');
        Account account1 = new Account(34567543, customer, 34.678);
        Account account2=new Account(23, customer);
        System.out.println(customer);
        System.out.println(customer.getName());
        System.out.println(customer.getId());
        System.out.println(customer.getGender());
        System.out.println(customer.toString());

        ///dghj
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account1.getId());
        System.out.println(account1.getCustomer());
        System.out.println(account1.getBalance());
        account1.setBalance(1000);
        System.out.println(account1.toString());
        System.out.println(account1.getCustomerName());
        System.out.println(account1.deposit(150));
        System.out.println(account1.withdraw(2000));










    }

}
