package com.water.animal.life.fish;

import com.water.animal.life.WaterFish;

public class Shark extends WaterFish implements Eat {
    public Shark() {
        super("large", "grey");
    }


    public void eat() {
        System.out.println("Eat big fish");
    }
}
