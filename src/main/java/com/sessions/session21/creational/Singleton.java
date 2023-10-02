package com.sessions.session21.creational;

public class Singleton {
        private static Singleton instance;

        private Singleton(){

        }

        public synchronized static Singleton getInstance(){
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }

}

class Test{
    public static void main(String[] args) {
        Singleton mySingleton = Singleton.getInstance();
        System.out.println(mySingleton);

        Singleton mySingleton2 = Singleton.getInstance();
    }
}
