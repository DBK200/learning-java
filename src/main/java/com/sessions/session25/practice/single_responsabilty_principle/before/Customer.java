package com.sessions.session25.practice.single_responsabilty_principle.before;

public class Customer {

    private String name;
    private String email;
//    "DRY" - Do not repeat yourself (nu duplica cod)
//     "KISS" - keep it short and simple
    public void save(Customer customer) {
        // Code for saving customer data to a database
    }

    public void sendEmail(Customer customer, String message) {
        // Code for sending an email to the customer
    }
    ///

    public void printInvoice(Customer customer) {
        // Code for printing an invoice for the customer
    }

    //
}
