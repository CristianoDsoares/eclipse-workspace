package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
 
		
		int count = 0;
		int m = sc.nextInt();
		int n =sc.nextInt();
		int [][] mat = new int [m][n];// mat.length
		
		
		for (int linha  =0; linha< m; linha++){
			
			for (int coluna = 0; coluna<n; coluna++) {
				mat[linha][coluna] = sc.nextInt();
				
			}			
			
		}
		
		int x 	= sc.nextInt();	
		
		System.out.println();
		 (int linha =0; linha< mat.length; linha++) {
			 for (int coluna =0; coluna< mat[linha ].length; coluna++) {
				 
				 if (mat[linha][coluna] == x) {
					 
					 
					 
					 System.out.println("Position"+linha+","+coluna+":");
					 if (coluna >0) {
						 
						 
						 System.out.println(  mat[linha][linha]+" ");
						 
						 
					 }
					 
					 
				 }
				 
				 
			 }
			 
			 
			 
			
			
		}
		
		
		

		
		
		sc.close();	

	}

}
