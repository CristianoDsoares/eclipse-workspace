package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int count = 0;
		int n =sc.nextInt();
		int [][] mat = new int [n][n];// mat.length
		
		
		for (int linha  =0; linha< mat.length; linha++){
			
			for (int coluna = 0; coluna< mat.length; coluna++) {
				mat[linha][coluna] = sc.nextInt();
				
			}			
			
		}
		
		System.out.println();
		System.out.println("Main Diagonal: ");
		for (int linha =0; linha< mat.length; linha++) {
			
			System.out.println(mat[linha][linha]+" ");
		}
		
		
		
		System.out.println();
		for (int linha=0; linha < mat.length; linha++ ) {
			for (int coluna =0; coluna< mat[linha ].length; coluna++) {
				if (mat[linha][coluna]<0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative Number = "+count);
		
		
		sc.close();			

	}

}
