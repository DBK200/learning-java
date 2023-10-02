package com.sessions.session21.creational.factory;

import java.util.Objects;

public class BirdFactory {

    public Bird getBird(String birdType) {
        // null checks, validations etc
        if (Objects.equals(birdType.toLowerCase(), "eagle")) {
            return new Eagle();
        } else if (Objects.equals(birdType.toLowerCase(), "owl")) {
            return new Owl();
        } else if(Objects.equals(birdType.toLowerCase(), "parrot")){
            return new Parrot();
        }
        else {
            return null;
        }
    }
}
