package com.sessions.session22.practice.singleton;

public class AppConfig {

    private static AppConfig appConfig;

    private AppConfig(){
        //
    }

    // Version 1
//    public static AppConfig getAppConfigInstance(){
//        return new AppConfig();
//    }

    // Version 2
    // synchronized takes care of multithreading
    public static AppConfig getAppConfigInstance(){
        if (appConfig == null)
            return appConfig = new AppConfig();
        return appConfig;
    }

}


class Test{
    public static void main(String[] args) {
        AppConfig appConfig1 = AppConfig.getAppConfigInstance();
        // Because the constructor is private
        // the following will fail
        //AppConfig appConfig2 = new AppConfig();

        // Because getAppConfigInstance() always calls
        // the constructor, then multiple instances will occur
        // This is not OK: Version 1
        AppConfig appConfig3 = AppConfig.getAppConfigInstance();
    }
}