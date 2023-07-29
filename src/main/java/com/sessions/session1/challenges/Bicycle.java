package com.sessions.session1.challenges;

public class Bicycle {
    private String make;

    private boolean mountainBike;

    private boolean discBrakes;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isMountainBike() {
        return mountainBike;
    }

    public void setMountainBike(boolean bIsMountainBike) {
        this.mountainBike = bIsMountainBike;
    }

    public boolean isDiscBrakes() {
        return discBrakes;
    }

    public void upgrade() {
        discBrakes = true;
    }

    /**
     * Prints out the class as follows:
     * <pre>{@code [Class name]} {@link make} {is/is not} a mountain bike and {has/doesn't have} disc brakes.</pre>
     */
    public void printClass() {
        System.out.printf("[%s] %s is"
                        + ( (mountainBike) ? " " : " not " )
                        + "a mountain bike and"
                        + ( (discBrakes) ? " has " : " doesn't have " )
                        + "disc brakes.%n",
                this.getClass().getSimpleName(), make);
    }
}
