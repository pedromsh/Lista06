package questao01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Janela extends JFrame{

	private Painel painel;
	
	public Janela() {
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizarLayout();
		setVisible(true);
		
	}
	
	public void organizarLayout() {
		setLayout(new BorderLayout());
		
		Painel painel = new Painel();
		add(painel, BorderLayout.CENTER);
		
        ArrayList<Botao> botoes = new ArrayList<>();
		
		botoes.add(new Botao("amarelo", Color.yellow, painel));
		botoes.add(new Botao("verde", Color.green, painel));
		botoes.add(new Botao("azul", Color.blue, painel));
		
		PainelBotoes painelBotoes = new PainelBotoes(botoes);
		add(painelBotoes, BorderLayout.NORTH);
		
	}
	
//	public ArrayList<Botao> criarBotoes() {
//		ArrayList<Botao> botoes = new ArrayList<>();
//		
//		botoes.add(new Botao("amarelo", Color.yellow, painel));
//		botoes.add(new Botao("verde", Color.green, painel));
//		botoes.add(new Botao("azul", Color.blue, painel));
//		
//		return botoes;
//	}
	
}

