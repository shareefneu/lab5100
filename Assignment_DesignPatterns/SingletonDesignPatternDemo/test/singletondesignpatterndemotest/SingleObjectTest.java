/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package singletondesignpatterndemotest;

import static org.junit.Assert.*;
import org.junit.Test;

import singletondesignpatterndemo.SingleObject;

/**
 * The SingleObjectTest is a JUnit Test class for testing the SingleObject class.
 * @author amer
 * @version 1.0
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }
    
    /**
     * The getInstanceTest() method is used to test the getInstance() method from SingleObject class.
     * @author amer
     * @version 1.0
     */
    @Test
    public void getInstanceTest(){
        
      
        SingleObject so = SingleObject.getInstance();
        assertEquals(so, SingleObject.getInstance());
        
        
    }
    
    /**
     * The showMessageTest() method is used to test the showMessage() method from SingleObject class.
     * @author amer
     * @version 1.0
     */
    @Test
    public void showMessageTest(){
        SingleObject so = SingleObject.getInstance();
        
        /** Positive Test Case */
        assertEquals("Hello from Singleton Class!", so.showMessage());
        
        /** Negative Test Case */
        assertNotEquals("Singleton Class Only", so.showMessage());
    }
}
