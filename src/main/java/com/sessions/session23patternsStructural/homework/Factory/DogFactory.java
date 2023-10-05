package com.sessions.session23patternsStructural.homework.Factory;

import com.sessions.session23patternsStructural.homework.DogR;
import com.sessions.session23patternsStructural.homework.Factory.Ciobanesc;
import com.sessions.session23patternsStructural.homework.Husky;

import java.util.Objects;

class DogFactory {
    DogR getDog(String dogType) {
        if (Objects.equals(dogType.toUpperCase(), "Husky")) {
            return new Husky();
        } else if (Objects.equals(dogType.toUpperCase(), "Ciobanesc")) {
            return new Ciobanesc();
        } else {
            return null;
        }
    }
}
