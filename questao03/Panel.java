package questao03;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel{

	private JButton button;
	private JTextField field; //JTextField é para o campo de texto
	
	public Panel() {
		this.button = new JButton("Enviar");
		this.field = new JTextField(20);
		ButtonAction botao = new ButtonAction(field);
		button.addActionListener(botao);
		add(field);
		add(button);
	}
}
