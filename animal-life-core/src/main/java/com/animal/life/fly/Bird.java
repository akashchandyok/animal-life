package com.animal.life.fly;

import com.animal.life.Animal;

/**
 * Bird extension class to Animal with fly and sing behaviour
 */
public class Bird extends Animal implements FeatureAnimal {

    public void sing() {
        System.out.println("I am singing");
    }


}
