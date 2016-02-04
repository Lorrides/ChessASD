
package modulo;


import java.awt.Color;

import javax.swing.JButton;

/*
 * Hver rute er en standard JButton med farge
 * 
 * Algoritmen bytter mellom svart og hvitt
 * for annenhver rute
 * 
 * Men dette gir ikke helt riktig løsning
 * 
 */
public class Square01 extends JButton  {
	
	public Square01(int i) {
		setBackground(calcColor(i));
	}
	
	Color calcColor(int n) {		
		boolean annenhverRute = (n % 2==0);		
		return (annenhverRute ? Color.BLACK : Color.WHITE);
	}
	
}
