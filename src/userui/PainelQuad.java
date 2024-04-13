package userui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelQuad extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldSides;
	private JTextField textFieldArea;
	private JTextField textFieldDouble;

	/**
	 * Create the panel.
	 */
	public PainelQuad() {
		setLayout(null);

		JLabel lblSides = new JLabel("Sides:");
		lblSides.setBounds(59, 65, 46, 14);
		add(lblSides);

		textFieldSides = new JTextField();
		textFieldSides.setBounds(59, 90, 86, 20);
		add(textFieldSides);
		textFieldSides.setColumns(10);

		textFieldArea = new JTextField();
		textFieldArea.setBounds(59, 174, 86, 20);
		add(textFieldArea);
		textFieldArea.setColumns(10);

		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(59, 149, 46, 14);
		add(lblArea);

		JLabel lblDouble = new JLabel("Double:");
		lblDouble.setBounds(198, 149, 46, 14);
		add(lblDouble);

		textFieldDouble = new JTextField();
		textFieldDouble.setBounds(198, 174, 86, 20);
		add(textFieldDouble);
		textFieldDouble.setColumns(10);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double sides = Double.parseDouble(textFieldSides.getText());
				DecimalFormat df = new DecimalFormat("#.##");
				// Alternative
				// double area = 0d;
				// area = sides * sides;

				// Calculates the area
				sides *= sides;

				String formattedResultArea = df.format(sides);

				textFieldArea.setText(formattedResultArea);

				// Doubles the area
				sides *= 2;

				String formattedResultDouble = df.format(sides);

				textFieldDouble.setText(formattedResultDouble);

			}
		});
		btnCalculate.setBounds(59, 232, 89, 23);
		add(btnCalculate);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldSides.setText("");
				textFieldArea.setText("");
				textFieldDouble.setText("");
				textFieldSides.requestFocus();

			}
		});
		btnClear.setBounds(198, 232, 89, 23);
		add(btnClear);

	}

}
