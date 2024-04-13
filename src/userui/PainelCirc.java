package userui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCirc extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldRadius;
	private JTextField textFieldResults;

	/**
	 * Create the panel.
	 *
	 */
	public PainelCirc() {
		setLayout(null);

		textFieldRadius = new JTextField();
		textFieldRadius.setBounds(52, 74, 86, 20);
		add(textFieldRadius);
		textFieldRadius.setColumns(10);

		JLabel lblRadius = new JLabel("Radius:");
		lblRadius.setBounds(52, 49, 46, 14);
		add(lblRadius);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double radius = Double.parseDouble(textFieldRadius.getText());
				double area = 0;
				double piValue = Math.PI;

				area = piValue * Math.pow(radius, 2);
				DecimalFormat df = new DecimalFormat("#.##");
				String formattedResult = df.format(area);

				textFieldResults.setText(formattedResult);

			}
		});
		btnCalculate.setBounds(52, 229, 89, 23);
		add(btnCalculate);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldRadius.setText("");
				textFieldRadius.requestFocus();
			}
		});
		btnClear.setBounds(206, 229, 89, 23);
		add(btnClear);

		textFieldResults = new JTextField();
		textFieldResults.setBounds(52, 145, 86, 20);
		add(textFieldResults);
		textFieldResults.setColumns(10);

		JLabel lblResults = new JLabel("Results:");
		lblResults.setBounds(52, 119, 46, 14);
		add(lblResults);

	}
}
