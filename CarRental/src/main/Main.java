package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.*;



public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("GT Car Rental System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new Homepage();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
