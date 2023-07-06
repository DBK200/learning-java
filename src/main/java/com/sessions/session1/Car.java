package com.sessions.session1;

public class Car {
    private String make;
    private String colour;
    private double speed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void increaseSpeed(double increment) {
        //
        // {a += b}    is identical to
        // {a = a + b}
        //
        // Ternary Operator (takes three operands):
        //
        // [Expression1] ? [Expression1] : [Expression2]
        //
        // Expression1: (boolean) condition to be verified
        // Expression2: executed when [Expression1] is TRUE
        // Expression3: executed when [Expression1] is FALSE
        //
        speed += (increment > 0) ? increment : 0;
    }

    public void decreaseSpeed(double increment) {
        // local variable
        double dTempSpeed = speed - increment;
        speed = (dTempSpeed < 0) ? 0 : dTempSpeed;
    }

    public boolean bIsMoving() {
        // returns the result of expression written in parentheses
        return (speed > 0);
    }

    public void printClass() {
        System.out.printf("[%s] %s has colour %s and "
                        + ( (speed > 0) ? "runs with %.1f km/h."
                                      : "currently is not moving." )
                        + "%n",
                this.getClass().getSimpleName(), make ,colour, speed);
    }

}
