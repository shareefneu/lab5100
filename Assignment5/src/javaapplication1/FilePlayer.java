///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package javaapplication1;
//
//import java.awt.PageAttributes;
//import java.io.File;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//
///**
// *
// * @author amer2
// */
//public class FilePlayer {
//    public void play(String filePath) {
//		try {
//			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
//			Clip clip = AudioSystem.getClip();
//			clip.open(audioInputStream);
//			clip.start();
//
//		} catch (Exception e) {
//			System.out.println("Error with playing sound.");
//			e.printStackTrace();
//		}
//
//	}
//
//    void play(PageAttributes.MediaType C) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}
