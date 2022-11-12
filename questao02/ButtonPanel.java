package questao02;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	public ButtonPanel(ArrayList<Button> buttons) {
		setLayout(new FlowLayout());
		
		for (Button button : buttons) {
			add(button);
		}
	}
}
