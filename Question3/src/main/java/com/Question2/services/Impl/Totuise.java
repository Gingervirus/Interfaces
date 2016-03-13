package com.Question2.services.Impl;

import com.Question2.domain.AnimalData;
import com.Question2.services.Animals;

/**
 * Created by Armin on 2016-03-13.
 */
public class Totuise implements Animals{
    public AnimalData getAnimal()
    {
        AnimalData tort = new AnimalData("Tortuise", "Reptile", "grass", "walking", "Grassland");
        tort.setName("Tortuise");
        tort.setType("Reptile");
        tort.setMovement("walking");
        tort.setFood("grass");
        tort.setHabitat("Grassland");
        return  tort;
    }
}
