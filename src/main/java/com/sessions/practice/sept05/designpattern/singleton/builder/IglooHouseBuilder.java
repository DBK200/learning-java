package com.sessions.practice.sept05.designpattern.singleton.builder;

public class IglooHouseBuilder implements HouseBuilder{
    private House house;

    public IglooHouseBuilder(){
        this.house = new House();
    }
    @Override
    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice blocks");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice carvings");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
