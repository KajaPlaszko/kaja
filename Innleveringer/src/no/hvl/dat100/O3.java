package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {


	public static void main(String[] args) {
		
		String talltxt = showInputDialog("Gi et tall: ");
		int n = parseInt(talltxt);
		double sum = 1.0;
		if (n>0) 
			for ( int i= 1; i<=n; i++)
				sum *= i;
		System.out.println("n! = " + sum);
	}	
		
}
