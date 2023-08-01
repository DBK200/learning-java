package com.sessions.session8.HomeworkSession8;

public class Animal {
    private String species;
    private int nrOfWings;
    private int nrOfPaws;

    // Constructor
    public Animal(String species, int nrOfWings, int nrOfPaws){
        this.species = species;
        this.nrOfWings = nrOfWings;
        this.nrOfPaws = nrOfPaws;
    }
    // Methods

    // Getters
    public String getSpecies(){
        return species;
    }

    public int getNrOfWings(){
        return nrOfWings;
    }

    // Setters
    public void setSpecies(String species){
        this.species = species;
    }

    public void setNrOfWings(int nrOfWings){
        this.nrOfWings = nrOfWings;
    }

    public void setNrOfPaws(int nrOfPaws){
        this.nrOfPaws = nrOfPaws;
    }

    public void displayInfo(){
        System.out.println("This animal is a: " + species +
                            " \nIt has " + nrOfWings + " wings " +
                            " \n and " + nrOfPaws + " paws");
    }

    public void checkIfBird(){
        if(getNrOfWings()<=0) {
            System.out.println("This animal can't fly");
        }
    }

    public void eat(){
        if(getNrOfWings() <= 0){
            System.out.println("This animal can eat anything");
        } else{
            System.out.println("This animal is probably a bird and it can eat bread and cereals");
        }
    }
}
