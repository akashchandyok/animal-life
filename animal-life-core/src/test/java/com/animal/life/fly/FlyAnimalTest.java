package com.animal.life.fly;


import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FlyAnimalTest {
    FeatureAnimal flyAnimal = new Bird();

    @Test
    public void testSing_BirdSinging(){
        //Assign  - ByteArrayOutputStream to capture print ln stream and assert against string
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //Act
        flyAnimal.sing();

        //Assert
        Assert.assertEquals("I am singing\n",outContent.toString());

    }

    @Test
    public void testWalk_BirdWalking(){
        //Assign  - ByteArrayOutputStream to capture print ln stream and assert against string
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //Act
        flyAnimal.walk();
        //Assert
        Assert.assertEquals("I am walking\n",outContent.toString());
    }


}
