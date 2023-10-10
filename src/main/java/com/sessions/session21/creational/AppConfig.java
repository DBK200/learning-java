package com.sessions.session21.creational;

public class AppConfig {
    private static AppConfig appConfig;
    private AppConfig(){}
    public synchronized static AppConfig getAppConfigInstance(){
        if (appConfig == null){
            appConfig=new AppConfig();
        }
        return appConfig;
    }
}

class Test2{
    public static void main(String[] args) {

        AppConfig appConfig = AppConfig.getAppConfigInstance();
//        AppConfig appConfig1 = new AppConfig();
        AppConfig appConfig2 = AppConfig.getAppConfigInstance();

    }
}