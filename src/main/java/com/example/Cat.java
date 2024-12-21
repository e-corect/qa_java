package com.example;

import java.util.List;

import static com.example.Literals.CATS_VOICE_VALUE;

public class Cat {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return CATS_VOICE_VALUE;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
