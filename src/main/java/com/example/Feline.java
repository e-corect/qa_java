package com.example;

import java.util.List;

import static com.example.Literals.*;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood(ANIMAL_KIND_PREDATOR);
    }

    @Override
    public String getFamily() {
        return ANIMAL_FAMILY_VALUE;
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
