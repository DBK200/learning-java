package com.sessions.session25.CleanCode;

public class ISP {
}
interface Document{
    void create();
    void open();
    void save();
    void close();
}
class TestDocument implements Document{

    @Override
    public void create() {
        System.out.println("Creating a text document");
    }

    @Override
    public void open() {
        System.out.println("Opening a text document");
    }

    @Override
    public void save() {
        System.out.println("Saving a text document");
    }

    @Override
    public void close() {
        System.out.println("Closing a text document");
    }
}
