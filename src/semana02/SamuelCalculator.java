/**
 * 
 */
package semana02;

import javax.swing.JOptionPane;

/**
 * 
 */
public class SamuelCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double variable1 = 0, variable2 = 0;
		String operation = "";

		variable1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your first number: \n"));
		operation = JOptionPane.showInputDialog("Enter your operation: \n");
		variable2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your second number: \n"));

		switch (operation) {
		case "+": {
			JOptionPane.showMessageDialog(null, "Result: " + Math.round((variable1 + variable2)));
			break;
		}
		case "-": {
			JOptionPane.showMessageDialog(null, "Result: " + Math.round((variable1 - variable2)));
			break;
		}
		case "*": {
			JOptionPane.showMessageDialog(null, "Result: " + Math.round((variable1 * variable2)));
			break;
		}
		case "/": {
			JOptionPane.showMessageDialog(null, "Result: " + Math.round((variable1 / variable2)));
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Invalid operation");
		}

	}

}
