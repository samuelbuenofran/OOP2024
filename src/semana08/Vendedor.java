package semana08;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario {

	public float comissao;

	@Override
	public void digitar() {
		super.digitar();
		comissao = Float.parseFloat(JOptionPane.showInputDialog("Comissão"));
	}
}
