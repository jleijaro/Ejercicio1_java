package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer c = new Customer();
        c.Customer("Jose","Jesus");

        Account a = new Account();
        a.deposit(1500);
        a.withdraw(1200);
        System.out.println("Mi balance es: "+a.getBalance()+"\n");

        c.Customer("leija","Rodriguez");
        Account a2 = new Account();
        a2.deposit(1700);
        a2.withdraw(1500);
        System.out.println("Mi balance es: "+a2.getBalance()+"\n");
    }
}
