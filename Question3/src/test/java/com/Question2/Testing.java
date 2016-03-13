package com.Question2;

import com.Question2.Config.Conf;
import com.Question2.domain.AnimalData;
import com.Question2.services.Animals;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Armin on 2016-03-13.
 */
public class Testing {
    private Animals animal;

    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Conf.class);
        animal = (Animals) ctx.getBean("camel");
    }

    @Test
    public void testName() throws Exception {
        AnimalData data = animal.getAnimal();
        System.out.println(" The Name is "+animal.getAnimal().getName());
        Assert.assertEquals(data.getName(),"Camel");
    }

    @Test
    public void testType() throws Exception {
        AnimalData data = animal.getAnimal();
        System.out.println(" The Type is "+animal.getAnimal().getType());
        Assert.assertEquals(data.getType(),"Mammel");

    }

    @Test
    public void testFood() throws Exception {
        AnimalData data = animal.getAnimal();
        System.out.println(" The Food is "+animal.getAnimal().getFood());
        Assert.assertEquals(data.getFood(),"grass");

    }

    @Test
    public void testMovement() throws Exception {
        AnimalData data = animal.getAnimal();
        System.out.println(" The Movement is "+animal.getAnimal().getMovement());
        Assert.assertEquals(data.getMovement(),"walking");
    }

    @Test
    public void testHabitat() throws Exception {
        AnimalData data = animal.getAnimal();
        System.out.println(" The Habitat is "+animal.getAnimal().getHabitat());
        Assert.assertEquals(data.getHabitat(),"Desert, has humps which stores water");

    }



}
