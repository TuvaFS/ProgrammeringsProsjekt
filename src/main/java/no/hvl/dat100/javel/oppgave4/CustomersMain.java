package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers list = new Customers(5);
        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Jonson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);

        //legg til kunder i liste
        list.addCustomer(c1);
        list.addCustomer(c2);
        list.addCustomer(c3);

        //print telling av kunder
        System.out.println("Number of customers: " + list.countNonNull());
        System.out.println();

        //hent kunde
        System.out.println(list.getCustomer(1001));
        System.out.println();

        //slett kunde
        list.removeCustomer(1003);

        //Kunder lagret i tabellen
        for (Customer c : list.getCustomers()) {
            System.out.println(c);
            System.out.println();
        }
    }
}
