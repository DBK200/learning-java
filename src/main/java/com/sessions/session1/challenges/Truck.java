package com.sessions.session1.challenges;

public class Truck {
    private String make;
    private int wheels;
    private boolean cabOver;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isCabOver() {
        return cabOver;
    }

    public void setCabOver(boolean cabOver) {
        this.cabOver = cabOver;
    }

    public boolean isArticulated() {
        // Cab-over-engine trucks are
        // articulated in Europe
        boolean bArticulated = cabOver;
        return bArticulated;
    }

    /**
     * Prints out the class as follows:
     * <pre>{@code [Class name]} {@link make} has {@link wheels} wheels, {/doesn't have} the cabin placed
     * over the engine and {is/is not} articulated in Europe.</pre>
     */
    public void printClass() {
        System.out.printf("[%s] %s has %d wheels,"
                + ( (cabOver) ? " " : " doesn't have " )
                + "the cabin placed over the engine and is"
                + ( (isArticulated()) ? " " : " not " )
                + "articulated in Europe.%n",
                this.getClass().getSimpleName(), make ,wheels);
    }
}
