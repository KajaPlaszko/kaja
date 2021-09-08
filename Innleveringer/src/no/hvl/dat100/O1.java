package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {
	
	
	public static void main(String[] args) {
		
		String Inntekt = showInputDialog("Din årlige inntekt: ");
		int inntekt = parseInt(Inntekt);
		double trinnskatt1 = 1.7 / 100;
		double trinnskatt2 = 4.0/100;
		double trinnskatt3 = 13.2 / 100;
		double trinnskatt4 = 16.2 /100;
		double trinnskatten;
		if ( 260100 >= inntekt && inntekt > 184800 ) {
			trinnskatten = inntekt*trinnskatt1;
			showMessageDialog(null, "Trinnskatten er: " + trinnskatten);
		}
		if ( 260100< inntekt && inntekt<=651250) {
			trinnskatten = inntekt*trinnskatt2;
			showMessageDialog(null, "Trinnskatten er: " + trinnskatten);			
		}
			
		if ( 651250< inntekt && inntekt<=1021550) {
			trinnskatten = inntekt*trinnskatt3;
			showMessageDialog(null, "Trinnskatten er: " + trinnskatten);		
		}
		if (1021550<inntekt) {
			trinnskatten = inntekt*trinnskatt4;
			showMessageDialog(null, "Trinnskatten er: " + trinnskatten);	
		}	
			
			
			
			
			
		
			
			
		
		
	}

}
