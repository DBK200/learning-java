package com.sessions.session22.factory;

import java.util.Objects;

public class BirdFactory {

    public Bird getBird(String birdType){
        if(Objects.equals(birdType.toLowerCase(),"eagle")){
            return new Eagle();
        } else if(Objects.equals(birdType.toLowerCase(),"owl")){
            return new Owl();
        }else if ( Objects.equals(birdType.toLowerCase(), "parrot")) {
            return new Parrot();
        } else {
            return null;
        }
    }
}
