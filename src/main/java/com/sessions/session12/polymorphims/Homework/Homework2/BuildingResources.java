package com.sessions.session12.polymorphims.Homework.Homework2;

public class BuildingResources {

        private int wood;
        private int metal;
        private int glass;
        private int cement;
        private int bricks;

    public String getWood() {
        return "Quantity of wood: " + wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public String getMetal() {
        return "Quantity of metal: " + metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public String getGlass() {
        return "Quantity of glass: " + glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    public String getCement() {
        return "Quantity of cement: " + cement;
    }

    public void setCement(int cement) {
        this.cement = cement;
    }

    public String getBricks() {
        return "Number of bricks: " + bricks;
    }

    public void setBricks(int bricks) {
        this.bricks = bricks;
    }
}
