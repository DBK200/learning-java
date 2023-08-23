package com.sessions.session12.polymorphims.Homework.Homework2;

import com.sessions.session11.abstraction.defaultMethod.B;

public class Admin extends Building implements User{
    @Override
    public String viewProgress() {
        return getBuildingStatus();
    }

    @Override
    public String getData() {
        return getBricks() + "\n" + getCement() + "\n" + getGlass() + "\n" + getWood() + "\n" + getMetal();
    }
}
