package com.sessions.session16.Enum;

public enum LightColor
{
    //Create an enum called LightColor that represents the three colors of a traffic light:
    // red, yellow, and green. Each color should have a string representation and a duration
    // (in seconds) associated with it (e.g., red = "Stop", 30 seconds; yellow = "Caution",
    // 5 seconds; green = "Go", 45 seconds).

    RED("Red=","STOP",30),
    YELLOW("Yellow=","CAUTION",5),
    GREEN("Green=","GO",60);
    private String permission;
    private String description;
    private int duration;
    LightColor(String permission,String description,int duration)
    {
        this.permission=permission;
        this.description=description;
        this.duration=duration;
    }
    public String getPermission()
    {
        return permission;
    }
    public String getDescription()
    {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args)
    {

        LightColor color=LightColor.RED;
        System.out.print(color);
        System.out.print(":"+color.description);
        System.out.println( "  " +color.getDuration()+" SECUNDE");
        try {
            Thread.sleep(30000); // Așteaptă 30 secunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" ");
        LightColor color2=LightColor.YELLOW;
        System.out.print(color2);
        System.out.print(":"+color2.description);
        System.out.println("  " +color2.getDuration()+" SECUNDE");
        try {
            Thread.sleep(5000); // Așteaptă 5 secunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" ");
        LightColor color3=LightColor.RED;
        System.out.print(color3);
        System.out.print(":"+color3.description);
        System.out.println("  " +color3.getDuration()+" SECUNDE");
        try {
            Thread.sleep(60000); // Așteaptă 60 secunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
