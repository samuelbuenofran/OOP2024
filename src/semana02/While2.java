/**
 * 
 */
package semana02;

import javax.swing.JOptionPane;

/**
 * 
 */
public class While2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double total = 0, v = 0;
		do {
			v = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
			total = total + v;
		} while (v != 0);
		JOptionPane.showMessageDialog(null, "Total: " + total);

	}

}
