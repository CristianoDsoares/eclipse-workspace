package application;

import javax.swing.*;

public class InitArray {
	
	public static void main(String[]args) {
		int  array[];
		array = new int [10];
		
		String output = "Subscript\tValue\n";
		for (int counter =0; counter < array.length; counter++) 
			output += counter + "\t" + array[counter]+ "\n";
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea,
				"Initializing an Array of int Value",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
