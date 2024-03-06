package userui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCalc extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNumber1;
	private JTextField textFieldNumber2;
	private JTextField textFieldResults;

	/**
	 * Create the panel.
	 */
	public PainelCalc() {
		setLayout(null);

		JLabel lblNumber1 = new JLabel("Number 1:");
		lblNumber1.setBounds(24, 11, 65, 14);
		add(lblNumber1);

		JLabel lblNumber2 = new JLabel("Number 2:");
		lblNumber2.setBounds(24, 72, 65, 14);
		add(lblNumber2);

		textFieldNumber1 = new JTextField();
		textFieldNumber1.setToolTipText("First number to be added.");
		textFieldNumber1.setBounds(22, 36, 124, 20);
		add(textFieldNumber1);
		textFieldNumber1.setColumns(10);

		textFieldNumber2 = new JTextField();
		textFieldNumber2.setToolTipText("Second number to be added.");
		textFieldNumber2.setBounds(24, 97, 122, 20);
		add(textFieldNumber2);
		textFieldNumber2.setColumns(10);

		textFieldResults = new JTextField();
		textFieldResults.setToolTipText("Results box.");
		textFieldResults.setBounds(24, 236, 122, 20);
		add(textFieldResults);
		textFieldResults.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Sum", "Subtract", "Multiply", "Divide" }));
		comboBox.setBounds(24, 167, 122, 22);
		add(comboBox);

		JLabel lblResult = new JLabel("Results:");
		lblResult.setBounds(24, 211, 46, 14);
		add(lblResult);

		JLabel lblOperation = new JLabel("Operation:");
		lblOperation.setBounds(24, 142, 65, 14);
		add(lblOperation);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float number1 = Float.parseFloat(textFieldNumber1.getText());
				float number2 = Float.parseFloat(textFieldNumber2.getText());
				String operation = comboBox.getSelectedItem().toString();
				String errorMsg = "Error";
				float result = 0;

				DecimalFormat df = new DecimalFormat("#.##"); // Create a DecimalFormat object

				switch (operation) {
				case "Sum": {
					result = number1 + number2;
					String formattedResult = df.format(result); // Format the result using the pattern
					textFieldResults.setText(formattedResult);
					break;
				}
				case "Subtract": {
					result = number1 - number2;
					String formattedResult = df.format(result); // Format the result using the pattern
					textFieldResults.setText(formattedResult);
					break;
				}
				case "Multiply": {
					result = number1 * number2;
					String formattedResult = df.format(result);
					textFieldResults.setText(formattedResult);
					break;
				}
				case "Divide": {
					result = number1 / number2;
					String formattedResult = df.format(result);
					textFieldResults.setText(formattedResult);
					break;
				}
				default: {
					textFieldResults.setText(errorMsg);
				}
				}
			}
		});
		btnCalculate.setBounds(189, 235, 89, 23);
		add(btnCalculate);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldNumber1.setText("");
				textFieldNumber2.setText("");
				textFieldResults.setText("");
				textFieldNumber1.requestFocus();
			}
		});
		btnClear.setBounds(306, 235, 89, 23);
		add(btnClear);

	}
}
