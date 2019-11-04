package com.animal.life.feature.animal;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RoosterTest {
    FeatureAnimal featureAnimal = new Rooster();
    @Test
    public void testWalk_ChickenWalking(){
        //Assign  - ByteArrayOutputStream to capture print ln stream and assert against string
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //Act
        featureAnimal.walk();
        //Assert
        Assert.assertEquals("I am walking\n",outContent.toString());
    }

    @Test
    public void testSing_ChickenSinging(){
        //Assign  - ByteArrayOutputStream to capture print ln stream and assert against string
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //Act
        featureAnimal.sing();
        //Assert
        Assert.assertEquals("Cock-a-doodle-doo\n",outContent.toString());
    }
}
