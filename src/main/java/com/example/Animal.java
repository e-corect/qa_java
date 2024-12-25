package com.example;

import java.util.List;

import static com.example.Literals.*;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if (ANIMAL_KIND_HERBIVOROUS.equals(animalKind)) {
            return HERBIVOROUS_FOOD;
        } else if (ANIMAL_KIND_PREDATOR.equals(animalKind)) {
            return PREDATORS_FOOD;
        } else {
            throw new Exception(UNKNOWN_ANIMAL_SPECIES_ERROR);
        }
    }

    public String getFamily() {
        return ANIMAL_FAMILIES_LIST;
    }
}