package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        // Test constructor
        Customer myCustomer = new Customer("Karianne", "kari@test.no", 1, PowerAgreementType.SPOTPRICE);
        System.out.println("Testing constructor:" + System.lineSeparator() + "-----------------------");
        System.out.println(myCustomer.toString() + System.lineSeparator());

        // Test setters
        System.out.println("Testing setters:" + System.lineSeparator() + "-----------------------");
        myCustomer.setName("Karianne Blikra");
        myCustomer.setEmail("karianne.blikra@gmail.com");
        myCustomer.setCustomerId(1001);
        myCustomer.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println(myCustomer.toString() + System.lineSeparator());

        // Test getters
        System.out.println("Testing getters:" + System.lineSeparator() + "-----------------------");
        Customer myCustomer2 = new Customer("Tuva", "tuva@test.no", 2, PowerAgreementType.POWERSUPPORT);

        System.out.println("CustomerId: " + myCustomer2.getCustomerId());
        System.out.println("Name: " + myCustomer2.getName());
        System.out.println("Email: " + myCustomer2.getEmail());
        System.out.println("Agreement: " + myCustomer2.getAgreement());


        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
