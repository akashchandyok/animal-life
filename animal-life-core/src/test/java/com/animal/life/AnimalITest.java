
package com.animal.life;

import com.animal.life.Animal;
import com.animal.life.AnimalI;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Test class for AnimalI contract method
 */
public class AnimalITest {
    AnimalI animal = new Animal();

    @Test
    public void testWalk_AnimalWalk(){
        //Assign  - ByteArrayOutputStream to capture print ln stream and assert against string
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //Act
        animal.walk();
        //Assert
        Assert.assertEquals("I am walking\n",outContent.toString());
    }
}
