package com.Question2.Config;

import com.Question2.domain.AnimalData;
import com.Question2.services.Animals;
import com.Question2.services.Impl.Camel;
import com.Question2.services.Impl.Dog;
import com.Question2.services.Impl.Shark;
import com.Question2.services.Impl.Totuise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Armin on 2016-03-13.
 */
public class Conf {
    @Bean(name="camel")
    public Animals getCamel(){
        return new Camel();
    }

    @Bean(name="shark")
    public Animals getShark(){
        return new Shark();
    }
    @Bean(name="dog")
    public Animals getDog(){
        return new Dog();
    }
    @Bean(name="tort")
    public Animals getTortuise(){
        return new Totuise();
    }
}
