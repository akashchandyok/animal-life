package com.animal.life.feature.animal;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.ResourceBundle;

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
        Locale.setDefault(new Locale("en", "US"));
        //Assign  - ByteArrayOutputStream to capture print ln stream and assert against string
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //Act
        featureAnimal.sing();

        //Assert
        String value = outContent.toString().replace("\n", "");
        Assert.assertEquals("Cock-a-doodle-doo",value);
    }

    @Test
    public void testSing_ChickenSinging_Frenh(){
        Locale.setDefault(new Locale("fr", "FR"));
        //Assign  - ByteArrayOutputStream to capture print ln stream and assert against string
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //Act
        featureAnimal.sing();

        //Assert
        String value = outContent.toString().replace("\n", "");
        Assert.assertEquals("cocorico",value);

    }




}
