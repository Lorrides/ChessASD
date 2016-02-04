
package modulo;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/*
 * Hver rute er en standard JButton med farge
 * 
 * Hver JButton kan klikkes på
 * og skriver dermed ut hvilken 
 * kolonne den er i
 * 
 */

public class Square03 extends JButton implements ActionListener {

	int n;
	
	public Square03(int i) {
		n = i;
		addActionListener(this);
		setBackground(calcColor(n));
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Kolonne nummer "+n % 8);		
	}
	
	Color calcColor(int n) {		
		boolean annenhverRute = (n % 2==0);
		boolean annenhverRad = ((n / 8) % 2 == 0);
		return (annenhverRute != annenhverRad?Color.BLACK:Color.WHITE);
	}
	
}
