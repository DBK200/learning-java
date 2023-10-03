package com.sessions.session21.creational.singletonexample;

import com.sessions.session11.abstraction.defaultmethod.A;

public class AppConfigAV {
    private static AppConfigAV appConfig;

    private AppConfigAV() {

    }
    public synchronized static AppConfigAV getAppConfigInstance() {
        if (appConfig == null) {
            appConfig = new AppConfigAV();
        }
        return appConfig;
    }
}

class Test {
    public static void main(String[] args) {
        AppConfigAV appConfig = AppConfigAV.getAppConfigInstance();
        //AppConfigAV appConfig2 = new AppConfigAV();
        AppConfigAV appConfig3 = AppConfigAV.getAppConfigInstance(); //acealsi obiect
    }
}