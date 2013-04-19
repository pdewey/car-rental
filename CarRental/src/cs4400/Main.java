package cs4400;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("GT Car Rental System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ViewPanel panel = new ViewPanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
