/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battleship;

/**
 *
 * @author amer2
 */
public interface Battleship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Android android = new Android();
    Ios ios = new Ios();
    android.play();
    android.save();
    android.load();
    ios.play();
    ios.save();
    ios.load();
    }

    
}



