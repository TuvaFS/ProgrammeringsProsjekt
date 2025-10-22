package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;

        for (Customer c : customers) {
            if (c != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        for (Customer customer : customers) {
            if (customer != null && customer.getCustomerId() == customer_id) {
                c = customer;
                funnet = true;
                break;
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i < customers.length && !inserted; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        for (int i = 0; i < customers.length && !deleted; i++) {
            if (customers[i] != null && customers[i].getCustomerId() == customer_id) {
                c = customers[i];
                customers[i] = null;
                deleted = true;
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;

        int count = countNonNull();
        customers = new Customer[count];

        int index = 0;
        for (Customer c : this.customers) {
            if (c != null) {
                customers[index] = c;
                index++;
            }
        }

        return customers;
    }
}