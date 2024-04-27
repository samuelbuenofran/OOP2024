package semana08;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {

	public String cpf, rg;

	@Override
	public void digitar() {
		super.digitar();
		cpf = JOptionPane.showInputDialog("CPF");
		rg = JOptionPane.showInputDialog("RG");
	}

}

/*
 * Opening verses of Beowulf, in Old English: Hwæt. We Gardena in geardagum,
 * þeodcyninga, þrym gefrunon, hu ða æþelingas ellen fremedon. Oft Scyld Scefing
 * sceaþena þreatum,
 * 
 *
 * 
 */