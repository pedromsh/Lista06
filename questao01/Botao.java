package questao01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton implements ActionListener{

	private Painel painel;
	private Color cor;
	
	public Botao(String texto, Color cor, Painel painel) {
		setText(texto);
		setBackground(cor);
		
		this.painel = painel;
		this.cor = cor;
		
		addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		painel.setBackground(cor);
		
	}
}
