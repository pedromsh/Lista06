package questao04;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	public Window(JPanel panel) {
		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}
}
