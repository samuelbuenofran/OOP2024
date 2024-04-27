package semana08;

import javax.swing.JButton;

import javafx.scene.paint.Color;

public class Botao extends JButton {

	private JButton btOriginal;
	private Botao btPersonal;

	public Botao(String titulo) {

		setText(titulo);
		setBackground(Color.PINK);
		setSize(100, 50);

	}

}
