package com.Question2.services.Impl;

import com.Question2.domain.AnimalData;
import com.Question2.services.Animals;

/**
 * Created by Armin on 2016-03-13.
 */
public class Shark implements Animals{
    public AnimalData getAnimal()
    {
        AnimalData shark = new AnimalData();
        shark.setName("Shark");
        shark.setType("Mammel");
        shark.setMovement("swimming");
        shark.setFood("meat");
        shark.setHabitat("warm water, near schools of fishes");
        return  shark;
    }

}
