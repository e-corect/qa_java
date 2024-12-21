package com.example;

import java.util.List;

import static com.example.Literals.*;

public class LionAlex extends Lion{

    public LionAlex(String sex, Feline feline) throws Exception {
        super(MALE_SEX_VALUE, feline);
    }

    public List<String> getFriends(){
        return LIONS_MARTY_FRIENDS;
    }

    public String getPlaceOfLiving(){
        return LIONS_MARTY_RESIDENCE;
    }

    @Override
    public int getKittens(){
        return 0;
    }

}
