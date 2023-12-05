/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.nio.file.Files;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author amer2
 */
public class JavaApplication1 {

    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
}

class Thread1 extends Thread
{
    public void play(String filePath) {
		try {
                    System.out.print(new File(filePath).getAbsoluteFile());
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
                        Thread.sleep(clip.getMicrosecondLength()/1000);

		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}

	}
    public void run()
    {
        var paths = new String[] {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
        for (String i : paths) 
        { 
            System.out.println("Playing " +i );
            play(i);
        }
    }
}

class Thread2 extends Thread
{
    public void play(String filePath) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();

		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}

	}
    public void run()
    {
         var paths = new String[] {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};
        for (String i : paths) 
        { 
            System.out.println("Playing " +i );
            play(i);
        }
    }
}

