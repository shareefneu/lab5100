/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletondesignpatterndemo;

/**
 * The SingletonDesignPatternDemo is a concrete class which shows the functionality of the Singleton Design Pattern.
 * @author amer
 * @version 1.0
 */
public class SingletonDesignPatternDemo {

    /**
     * The main() method, from which Java starts executing code.
     * @param args the command line arguments
     * @author amer
     * @version 1.0
     */
    public static void main(String[] args) {
       
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
    
}
