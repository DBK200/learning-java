package com.sessions.session22;

public class AppConfigR
{
    private static AppConfigR appConfigR;
    private AppConfigR()
    {

    }
    public synchronized static AppConfigR getInstance()
    {
        //return new AppConfigR();//returneaza un nou obiect de tip appConfig
        if(appConfigR==null)
        {
            //daca este null atunci fac obiect
            appConfigR=new AppConfigR();
        }
        return appConfigR;
    }
}
class TestR
{
    public static void main(String[] args)
    {
        AppConfigR appConfigR=AppConfigR.getInstance();
       // AppConfigR appConfig2=new AppConfigR(); vrem sa nu permitem acest lucru si facem constructorul privat

        AppConfigR appConfigR1=AppConfigR.getInstance();
    }
}
