
package modulo;


import java.awt.GridLayout;

import javax.swing.JPanel;

public class SquareMatrix extends JPanel {
	
	public SquareMatrix() {
		setLayout(new GridLayout(8,0));
		for (int i=0; i<64;i++)
			add(new Square03(i));
	}

}
