package com.example;

import java.util.List;
import static com.example.Literals.*;

public class Lion {

    boolean hasMane;

    private Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if (MALE_SEX_VALUE.equals(sex)) {
            hasMane = true;
        } else if (FEMALE_SEX_VALUE.equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception(WRONG_ANIMAL_SEX_ERROR);
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood(ANIMAL_KIND_PREDATOR);
    }
}
