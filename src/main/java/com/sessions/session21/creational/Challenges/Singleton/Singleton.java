package com.sessions.session21.creational.Challenges.Singleton;
 public class Singleton {

    private static Singleton instance;

    private Singleton(){
    }
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void print(String message){
        System.out.println("Some message: " + message);
    }

}
class Main{
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.print("message 1");
        singleton.print("message 2");

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);
    }
}
