package questao01;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PainelBotoes extends JPanel{

	public PainelBotoes(ArrayList<Botao> botoes) {
		
		setLayout(new FlowLayout());
		
		for (Botao botao : botoes) {
			add(botao);
		}
	}
}
