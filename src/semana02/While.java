/**
 * 
 */
package semana02;

import javax.swing.JOptionPane;

/**
 * 
 */
public class While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		while (true) {
			double v = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
			total += v;
		}

	}

}
