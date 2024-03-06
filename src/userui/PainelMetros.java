package userui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelMetros extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldMeters;
	private JTextField textFieldCentimeters;
	private JTextField textFieldResults;

	/**
	 * Create the panel.
	 */
	public PainelMetros() {
		setLayout(null);

		JLabel lblMeters = new JLabel("Meters:");
		lblMeters.setBounds(42, 41, 46, 14);
		add(lblMeters);

		textFieldMeters = new JTextField();
		textFieldMeters.setBounds(42, 66, 86, 20);
		add(textFieldMeters);
		textFieldMeters.setColumns(10);

		JLabel lblCentimeters = new JLabel("Centimeters:");
		lblCentimeters.setBounds(187, 41, 95, 14);
		add(lblCentimeters);

		textFieldCentimeters = new JTextField();
		textFieldCentimeters.setBounds(187, 66, 86, 20);
		add(textFieldCentimeters);
		textFieldCentimeters.setColumns(10);

		JButton btnMToCm = new JButton("Meters to Cm");
		btnMToCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float meters = Float.parseFloat(textFieldMeters.getText());
				float results = 0;
				results = meters * 100;

				DecimalFormat df = new DecimalFormat("#.##"); // Create a DecimalFormat object
				String formattedResult = df.format(results); // Format the result using the pattern

				textFieldResults.setText("" + formattedResult);
				// textFieldMeters.setText("");
			}
		});
		btnMToCm.setBounds(36, 228, 126, 23);
		add(btnMToCm);

		JButton btnCmToM = new JButton("Cm to Meters");
		btnCmToM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float centimeters = Float.parseFloat(textFieldCentimeters.getText());
				float results = 0;
				results = centimeters / 100;

				DecimalFormat df = new DecimalFormat("#.##"); // Create a DecimalFormat object
				String formattedResult = df.format(results); // Format the result using the pattern

				textFieldResults.setText("" + formattedResult);
			}
		});
		btnCmToM.setBounds(213, 228, 115, 23);
		add(btnCmToM);

		JLabel lblConversionResults = new JLabel("Conversion Results:");
		lblConversionResults.setBounds(71, 126, 126, 14);
		add(lblConversionResults);

		textFieldResults = new JTextField();
		textFieldResults.setBounds(81, 154, 86, 20);
		add(textFieldResults);
		textFieldResults.setColumns(10);

	}

}
