/**
 * 
 */
package semana02;

import javax.swing.JOptionPane;

/**
 * 
 */
public class While3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0, v = 0;
		do {
			String s = JOptionPane.showInputDialog("Digite um valor:");
			if (s == null)
				break;
			// Explanation: Double.parseDouble() throws a NumberFormatException if the
			// string does not contain a parsable double.
			v = Double.parseDouble(s);
			total = total + v;
		} while (v != 0);
		JOptionPane.showMessageDialog(null, "Total: " + total);

	}

}
