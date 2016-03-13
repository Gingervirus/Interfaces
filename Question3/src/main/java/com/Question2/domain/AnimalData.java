package com.Question2.domain;

import java.io.Serializable;

/**
 * Created by Armin on 2016-03-13.
 */
public class AnimalData implements Serializable
{
    private String name;
    private String type;
    private String food;
    private String movement;
    private String habitat;

    public AnimalData(String habitat, String movement, String type, String food, String name) {
        this.habitat = habitat;
        this.movement = movement;
        this.type = type;
        this.food = food;
        this.name = name;
    }

    public AnimalData()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "AnimalData{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", food='" + food + '\'' +
                ", movement='" + movement + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
