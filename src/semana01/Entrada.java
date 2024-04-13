package semana01;

import javax.swing.JOptionPane;

public class Entrada {
	public static void main(String[] args) {
		String[] v = new String[2];

		v[0] = JOptionPane.showInputDialog("Forneça n1: ");
		v[1] = JOptionPane.showInputDialog("Forneça n2: ");

//		String n1 = JOptionPane.showInputDialog("Forneça n1: ");
//		String n2 = JOptionPane.showInputDialog("Forneça n2: ");

		Calculadora.main(v);
	}
}
