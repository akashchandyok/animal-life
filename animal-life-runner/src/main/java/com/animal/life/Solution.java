package com.animal.life;

import com.animal.life.fly.Bird;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();

        //Important
        //technically speaking not all birds can fly so bird should not have fly method
        //As per point number 2 chicken can not fly so either chicken is not type of bird or bird itself
        //should not fly.
        //bird.fly();

        bird.sing();
    }
}
