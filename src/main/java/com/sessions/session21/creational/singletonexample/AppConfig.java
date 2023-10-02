package com.sessions.session21.creational.singletonexample;

public class AppConfig {
    private static AppConfig appConfig;
    private AppConfig(){}
    public static AppConfig getAppConfigInstance(){
        if(appConfig==null){
            appConfig=new AppConfig();
        }
        return new AppConfig();
    }
}

class Test{
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getAppConfigInstance();
    }
}
