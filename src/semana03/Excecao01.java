package semana03;

import javax.swing.JOptionPane;

import semana04.Metodos;

public class Excecao01 {

	public static void main(String[] args) {

		Metodos.imprimir();

		// Exemplo de exceção

		while (true) {
			try {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
				JOptionPane.showMessageDialog(null, idade);
				break;
			} catch (NumberFormatException erro) {
				System.out.println("Error: " + erro);
				JOptionPane.showMessageDialog(null, "Digite um valor inteiro");
			}
		}

		/*
		 * while (true) { try { String s =
		 * JOptionPane.showInputDialog("Digite sua idade"); if (s == null) break; int
		 * idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		 * JOptionPane.showMessageDialog(null, idade); break; } catch
		 * (NumberFormatException erro) { System.out.println("Error: " + erro);
		 * JOptionPane.showMessageDialog(null, "Digite um valor inteiro"); } }
		 */

	}

}
