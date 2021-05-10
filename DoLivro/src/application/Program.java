package application;


import java.net.*;
import java.util.*;

import javax.swing.JTextArea;

import java.awt.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		JTextArea outputArea = new JTextArea();
		
		Container container = getContentPane();
		
		container.add (outputArea);
		
		int array [] = {1,2,3,4,5};
		
		
		String output = "Effects of passing entire array by reference:\n"+
		"The Values of the original array are:\n";
		
		for (int counter = 0; counter < array.length; counter++)
			output += " "+ array [counter];
		
		modifyArray (array); 
		
		
		output += "n\nthe values of the modified array are: \n";
		
		for (int counter =0; counter< array.length; counter++)
				output += " " + array [counter];
		
		output  += "\n\nEffects of passing array " 
				+ "element by value: \n"
				+ "a[3] before modifyElement: " 
				+ array [3];
		
		
		modifyElement(array[3]);
		
		output += "\na[3] after modifyElement: "+array [3];
		outputArea.setText (output);

	}
	
	public static void modifyArray(int[] array2) {
		// TODO Auto-generated method stub
		for (int counter =0; counter < array2.length; counter++)
			array2[counter]*=2;
	}
	private static Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void modifyElement(int element) {
		element +=2;
	}

}
