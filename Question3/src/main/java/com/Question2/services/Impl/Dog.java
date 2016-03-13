package com.Question2.services.Impl;

import com.Question2.domain.AnimalData;
import com.Question2.services.Animals;

/**
 * Created by Armin on 2016-03-13.
 */
public class Dog implements Animals{
    public AnimalData getAnimal()
    {
        AnimalData dog = new AnimalData();
        dog.setName("Dog");
        dog.setType("Mammel");
        dog.setMovement("walking");
        dog.setFood("meat");
        dog.setHabitat("Homes, being pets");
        return  dog;
    }
}
