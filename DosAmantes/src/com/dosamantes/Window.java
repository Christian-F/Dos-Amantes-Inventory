package com.dosamantes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame{
	
	public static JFrame mainFrame = new JFrame("Dos Amantes Inventory");
	
	static int totalButtons = 0;
	
	public static void startWindow(){
		mainFrame.setSize(800,600);
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	}
	
	static void createButtons(){
		JButton btnTest = new JButton("Tets");
		btnTest.setPreferredSize(new Dimension(20, 10));
		btnTest.setLocation(780 ,580);
		btnTest.setBackground(Color.blue);
		btnTest.setVisible(true);
	}
}
