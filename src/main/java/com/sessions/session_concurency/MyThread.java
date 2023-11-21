package com.sessions.session_concurency;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("hello");
    }

}

class Main{
    public static void main(String[] args) {
        // Gets current thread
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(myThread.getName());
    }
}


