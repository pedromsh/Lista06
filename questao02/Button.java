package questao02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Button extends JButton implements ActionListener{

	private JLabel label;
	
	public Button(String text, JLabel label) {
		this.label = label;
		setText(text);
		
		addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText(getText());
		
	}
}
