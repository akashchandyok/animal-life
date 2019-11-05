package com.water.animal.life.swimmer;

import com.water.animal.life.WaterAnimal;
import com.water.animal.life.WaterFish;

public class Dolphin {
    private WaterAnimal waterAnimal;

    void Dolphin() {
        waterAnimal = new WaterFish("large", "white");
    }

    public void swim(){
        waterAnimal.swim();
    }
}
