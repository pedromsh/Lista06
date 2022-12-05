package questao04;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel{

	private JButton button;
	private JTextField field;
	private JLabel label;
	
	public Panel() {
		this.field = new JTextField(10);
		this.button = new JButton("OK");
		add(field);
		add(button);
		
	}
}
