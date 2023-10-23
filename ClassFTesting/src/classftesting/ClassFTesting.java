/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classftesting;

import java.io.FileInputStream;

/**
 *
 * @author amer2
 */
public class ClassFTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try {
//file = new FileInputStream(fileName);
//x = (byte) file.read(); }
//catch (IOException i) {
//i.printStackTrace();
//return -1;
//} catch (FileNotFoundException f) // Not valid!
//{
//f.printStackTrace();
//return -1;}

try {
String fileName = "E://file.txt"    
file = new FileInputStream(fileName);
x = (byte) file.read(); }
catch (IOException i) {
i.printStackTrace();
return -1;
} catch (FileNotFoundException f) // Not valid!
{
f.printStackTrace();
return -1;}


    }
    
}
