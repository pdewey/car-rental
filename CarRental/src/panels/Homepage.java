package panels;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Homepage extends JPanel{
	private JButton rentCar, viewPersonal, viewRental;
	ButtonListener listener = new ButtonListener();
	
	public Homepage(){
		setLayout(new GridLayout(9,7));
		setBorder(BorderFactory.createLineBorder(getBackground(), 15));
		setPreferredSize(new Dimension(800,600));
		
		rentCar = new JButton("Rent a Car");
		viewPersonal = new JButton("Enter/View Personal Information");
		viewRental = new JButton("View Rental Information");
		
		add(rentCar);
		add(viewPersonal);
		add(viewRental);
	}
	
	private class ButtonListener implements ActionListener{
		/**
		 * Determines which button was clicked and calls the appropriate method
		 */
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == rentCar) {
				// Change view to rentCar
			}
			else if (e.getSource() == viewPersonal) {
				// Change view to viewPersonal
			}
			else if (e.getSource() == viewRental) {
				// Change view to viewRenal
			}
		}
		
	}
}
