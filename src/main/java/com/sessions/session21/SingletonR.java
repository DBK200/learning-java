package com.sessions.session21;

public class SingletonR
{
    private static SingletonR instance;
    private SingletonR()
    {

    }
    public static SingletonR getInstance()
    {
        if(instance==null)
        {
            instance = new SingletonR();
        }
        return instance;
    }
}
class Test
{
    public static void main(String[] args)
    {
        SingletonR mySingleton=SingletonR.getInstance();
        System.out.println(mySingleton);
        mySingleton=SingletonR.getInstance();

    }
}
