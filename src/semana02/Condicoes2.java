package semana02;

import javax.swing.JOptionPane;

public class Condicoes2 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Você gosta de futebol?");
		s = s.toUpperCase();
		if (s != null) {
			if (s.equals("S")) {
				JOptionPane.showMessageDialog(null, "Gosta");
			} else {
				if (s.equals("N")) {
					JOptionPane.showMessageDialog(null, "Não gosta");
				} else {
					JOptionPane.showMessageDialog(null, "Indeciso!");
				}
			}
		}
	}
}
