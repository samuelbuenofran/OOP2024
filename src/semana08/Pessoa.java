package semana08;

import javax.swing.JOptionPane;

public class Pessoa {

	private int codigo;
	public String nome;
	protected String apelido; // hierarquia e pacote

	public void digitar() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
		nome = JOptionPane.showInputDialog("Nome");
		apelido = JOptionPane.showInputDialog("Apelido");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}

/*
 * You thought you just did something there, didn't you? Well, sorry to burst
 * your bubble, but you didn't.
 * 
 * 
 */
