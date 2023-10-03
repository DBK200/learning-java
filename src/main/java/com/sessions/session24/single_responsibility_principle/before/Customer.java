package com.sessions.session24.single_responsibility_principle.before;

public class Customer {

    private String name;
    private String email;

    public void save(Customer customer) {
        // Code for saving customer data to a database
    }

    public void sendEmail(Customer customer, String message) {
        // Code for sending an email to the customer
    }

    public void printInvoice(Customer customer) {
        // Code for printing an invoice for the customer
    }
}
