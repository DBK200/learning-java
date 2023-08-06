package com.sessions.session8.homework;

import java.time.LocalDate;

public class Electronics
{
    protected LocalDate dateOfFabrication;

    public Electronics() {
        dateOfFabrication = LocalDate.now();
    }

    public Electronics(LocalDate dateOfFabrication) {
        this.dateOfFabrication = dateOfFabrication;
    }

    public LocalDate getDateOfFabrication() {
        return dateOfFabrication;
    }

    @Override
    public String toString()
    {
        return "Date of fabrication for the electronic produce is: " + dateOfFabrication + '\n';
    }
}