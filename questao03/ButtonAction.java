package questao03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonAction implements ActionListener{

	private JTextField field;

	public ButtonAction(JTextField field) {
		this.field = field;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "TextField1: " + field.getText());
		
	}

}
