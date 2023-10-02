package com.sessions.session22.factory;

import java.util.Objects;

public class BirdFactory {

    public Bird getBird(String birdType){
        if (Objects.equals(birdType,"eagle")){
            return new Eagle();
        }else if (Objects.equals(birdType,"owl")) {
            return new Owl();
        }else if(Objects.equals(birdType,"parrot")){
            return new  Parrot();
        }
        else {
            return null;
        }
    }
}
