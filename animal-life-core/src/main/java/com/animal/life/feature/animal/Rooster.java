package com.animal.life.feature.animal;

/**
 * My view:
 *
 * Point 3:
 * Rooster is type of Chicken and override it's sing behaviour.
 *
 * Point 3:
 * Rooster can be implemented using aggregation\composition relationship over Chicken,
 * this is also preferable design - Favor composition over inheritance is a one of the popular object-oriented design principles
 */

public class Rooster extends Chicken{
    @Override
    public void sing(){
        System.out.println("Cock-a-doodle-doo");
    }
}
