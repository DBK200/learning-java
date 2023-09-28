package com.sessions.session21.creational.singletonExample;

public class AppConfig {
private static AppConfig appConfig;
    private AppConfig(){

    }
    public synchronized static AppConfig getAppConfigInstance(){
        if(appConfig == null){
            appConfig = new AppConfig();
        }
        return  appConfig;
    }
}

class Test{
    public static void main(String[] args) {
        AppConfig appConfig= AppConfig.getAppConfigInstance();
//        AppConfig appconfig2 = new AppConfig();
        AppConfig appConfig3 = AppConfig.getAppConfigInstance();
    }
}