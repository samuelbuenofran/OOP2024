package userui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelNotas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldGrade1;
	private JTextField textFieldGrade2;
	private JTextField textFieldResults;
	private JTextField textFieldGrade3;

	/**
	 * Create the panel.
	 */
	public PainelNotas() {
		setLayout(null);

		JLabel lblGrade1 = new JLabel("Grade 1:");
		lblGrade1.setBounds(45, 40, 86, 14);
		add(lblGrade1);

		textFieldGrade1 = new JTextField();
		textFieldGrade1.setBounds(45, 65, 86, 20);
		add(textFieldGrade1);
		textFieldGrade1.setColumns(10);

		JLabel lblGrade2 = new JLabel("Grade 2:");
		lblGrade2.setBounds(45, 96, 86, 14);
		add(lblGrade2);

		textFieldGrade2 = new JTextField();
		textFieldGrade2.setBounds(45, 121, 86, 20);
		add(textFieldGrade2);
		textFieldGrade2.setColumns(10);

		textFieldResults = new JTextField();
		textFieldResults.setBounds(45, 231, 86, 20);
		add(textFieldResults);
		textFieldResults.setColumns(10);

		textFieldGrade3 = new JTextField();
		textFieldGrade3.setBounds(45, 171, 86, 20);
		add(textFieldGrade3);
		textFieldGrade3.setColumns(10);

		JLabel lblGrade3 = new JLabel("Grade 3:");
		lblGrade3.setBounds(45, 152, 86, 14);
		add(lblGrade3);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float grade1 = Float.parseFloat(textFieldGrade1.getText());
				float grade2 = Float.parseFloat(textFieldGrade2.getText());
				float grade3 = Float.parseFloat(textFieldGrade3.getText());
				DecimalFormat df = new DecimalFormat("#.##");
				float results = 0;
				if (grade1 < 0 || grade1 > 10) {
					JOptionPane.showMessageDialog(btnCalculate, "Error, this grade is not valid.");
					textFieldGrade1.requestFocus();
				} else if (grade2 < 0 || grade2 > 10) {
					JOptionPane.showMessageDialog(btnCalculate, "Error, this grade is not valid.");
					textFieldGrade2.requestFocus();
				} else if (grade3 < 0 || grade3 > 10) {
					JOptionPane.showMessageDialog(btnCalculate, "Error, this grade is not valid.");
					textFieldGrade3.requestFocus();
				} else {
					results = ((grade1 + grade2 + grade3) / 3);
					String formattedResult = df.format(results);
					textFieldResults.setText(formattedResult);

					// textFieldResults.setText("" + results);
					// textFieldResults.setText(String.valueOf(results));
				}

			}
		});
		btnCalculate.setBounds(185, 230, 89, 23);
		add(btnCalculate);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldGrade1.setText("");
				textFieldGrade2.setText("");
				textFieldGrade3.setText("");
				textFieldResults.setText("");
				textFieldGrade1.requestFocus();
			}
		});
		btnClear.setBounds(284, 230, 89, 23);
		add(btnClear);

	}
}
