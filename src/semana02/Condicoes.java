package semana02;

import javax.swing.JOptionPane;

public class Condicoes {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Você gosta de futebol?");
		if (s.equals("S") || s.equals("s")) {
			JOptionPane.showMessageDialog(null, "Gosta");
		} else {
			if (s.equals("N") || s.equals("n")) {
				JOptionPane.showMessageDialog(null, "Não gosta");
			} else {
				JOptionPane.showMessageDialog(null, "Indeciso!");
			}
		}
	}
}
