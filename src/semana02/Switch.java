/**
 *
 */
package semana02;

import javax.swing.JOptionPane;

/**
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

		switch (n) {
		case 1: {
			System.out.println("Um");
			break;
		}
		case 2: {
			System.out.println("Dois");
			break;
		}
		case 3: {
			System.out.println("Três");
			break;
		}
		default:
			System.out.println("Outro número");
		}
	}
}
