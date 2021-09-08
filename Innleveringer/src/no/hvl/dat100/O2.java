package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {
		final int NRR = 10;
		
		
		int poeng = 0;
		
		for (int nr = 1; nr <= NRR ; nr++) {
			String poengsum = showInputDialog("Skriv inn din poengsum: ");
			poeng = parseInt(poengsum);
			
			if (0<=poeng && poeng <= 39)  
				System.out.println("Din karakter er F");
			else if (poeng >= 40 && poeng <= 49)
				System.out.println("Din karakter er E");
			else if (poeng >= 50 && poeng <= 59)
				System.out.println("Din karakter er D");
			else if ( poeng >= 60 && poeng <= 79)
				System.out.println("Din karakter er C");
			else if ( poeng >= 80 && poeng <= 89)
				System.out.println("Din karakter er B");
			else if (poeng >= 90 && poeng <= 100)
				System.out.println("Din karakter er A");
			
			else if ( poeng <0 || poeng>100) {
				showMessageDialog(null, "Du skrev inn ugyldig poengsum, prøv på nytt");
				nr--;
				
			}
			
			

			
				
		}
		

	}


}
