package com.animal.life.feature.animal;

public class Duck extends Bird implements SwimFeatureAnimal {

    @Override
    public void sing(){
        System.out.println("Quack, quack");
    }

    public void swim() {
        System.out.println("I am swimming");
    }
}
