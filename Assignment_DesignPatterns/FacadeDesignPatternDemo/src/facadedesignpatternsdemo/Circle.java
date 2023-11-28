/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpatternsdemo;

/**
 * Circle is a concrete class which implements the Shape interface.
 * @author amer
 * @version 1.0
 */
public class Circle implements Shape {

    @Override
    public String draw() {
        System.out.println("Circle::draw()");
        return "Circle::draw()";
    }
    
}
