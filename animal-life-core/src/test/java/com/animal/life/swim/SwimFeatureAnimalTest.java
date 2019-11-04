package com.animal.life.swim;

import com.animal.life.fly.Duck;
import com.animal.life.fly.SwimFeatureAnimal;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SwimFeatureAnimalTest {
    SwimFeatureAnimal swimFeatureAnimal = new Duck();

    @Test
    public void testSwim_DuckSwim(){
        //Assign  - ByteArrayOutputStream to capture print ln stream and assert against string
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //Act
        swimFeatureAnimal.swim();
        //Assert
        Assert.assertEquals("I am swimming\n",outContent.toString());
    }
}
