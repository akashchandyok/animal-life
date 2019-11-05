package com.water.animal.life.fish;

import com.water.animal.life.WaterFish;

public class Clownfish extends WaterFish implements Joke {

    public Clownfish() {
        super("small", "orange");
    }

    public void joke() {
        System.out.println("makes jokes");
    }
}
