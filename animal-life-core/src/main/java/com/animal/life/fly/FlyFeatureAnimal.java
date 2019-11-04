package com.animal.life.fly;

import com.animal.life.Animal;
import com.animal.life.AnimalI;

/**
 * Contract for flying animal which are also perform action as per Animal
 */
public interface FlyFeatureAnimal extends FeatureAnimal {
    void fly();
}
