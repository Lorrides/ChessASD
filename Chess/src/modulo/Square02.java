
package modulo;


import java.awt.Color;

import javax.swing.JButton;

/*
 * Hver rute er en standard JButton med farge
 * 
 * Algoritmen bytter mellom svart og hvitt
 * for annenhver rute og annhver rad
 * 
 * Dette gir riktig løsning
 * 
 */
public class Square02 extends JButton  {

	int n;
	
	public Square02(int i) {
		n = i;		
		setBackground(calcColor(n));
	}
	
	Color calcColor(int n) {		
		boolean annenhverRute = (n % 2==0);
		boolean annenhverRad = ((n / 8) % 2 == 0);
		return (annenhverRute != annenhverRad?Color.BLACK:Color.WHITE);
	}
	
}
