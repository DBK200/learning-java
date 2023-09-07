package com.sessions.homework13plus.h14;
import java.time.Duration;
public class EnumEx {
    public static void main(String[] args) {
        enum LightColor {
            RED("Stop",Duration.ofSeconds(30) ),
            YELLOW("Caution",Duration.ofSeconds(5)),
            GREEN("Go",Duration.ofSeconds(45));

            private final String representation;
            private final Duration duration;

            LightColor(String representation, Duration duration){
                this.representation= representation;
                this.duration = duration;

            }



        }
    }
}
