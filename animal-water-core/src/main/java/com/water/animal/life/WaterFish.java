package com.water.animal.life;

public class WaterFish implements WaterAnimal {
    protected String size;
    protected String colour;

    public WaterFish(String size,String colour){
        this.colour = colour;
        this.size = size;
    }

    public void swim() {
        System.out.println("I am swimming");
    }
}
