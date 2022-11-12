package questao02;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{

	private JLabel label;
	
	public Frame() {
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizeLayout();
		setVisible(true);
	}
	
	public void organizeLayout() {
		setLayout(new BorderLayout());

		label = new JLabel("Hello!");
		add(label, BorderLayout.NORTH);
		
		ArrayList<Button> buttons = new ArrayList<>();
		
		buttons.add(new Button("Java", label));
		buttons.add(new Button("JavaScript", label));
		buttons.add(new Button("Python", label));
		buttons.add(new Button("C++", label));
		buttons.add(new Button("C#", label));
		buttons.add(new Button("C", label));
		
		ButtonPanel panel = new ButtonPanel(buttons);
		add(panel, BorderLayout.CENTER);
		
	}
	
}
