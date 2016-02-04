package modulo;


import javax.swing.JFrame;

public class SjakkVindu extends JFrame {
	
	public SjakkVindu() {
		setTitle("Demo av modulo");
		add(new SquareMatrix());
		setSize(600,600);
		setVisible(true);
	}

}
