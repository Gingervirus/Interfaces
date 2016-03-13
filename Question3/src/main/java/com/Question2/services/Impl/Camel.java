package com.Question2.services.Impl;

import com.Question2.domain.AnimalData;
import com.Question2.services.Animals;

/**
 * Created by Armin on 2016-03-13.
 */
public class Camel implements Animals{
    public AnimalData getAnimal()
    {
        AnimalData camel = new AnimalData();
        camel.setName("Camel");
        camel.setType("Mammel");
        camel.setMovement("walking");
        camel.setFood("grass");
        camel.setHabitat("Desert, has humps which stores water");
        return  camel;
    }

}
