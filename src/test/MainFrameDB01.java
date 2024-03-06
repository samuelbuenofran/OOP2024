package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrameDB01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFieldName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameDB01 frame = new MainFrameDB01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrameDB01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel dbPanel = new JPanel();
		dbPanel.setBounds(34, 64, 379, 263);
		contentPane.add(dbPanel);
		dbPanel.setLayout(null);

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 11, 46, 14);
		dbPanel.add(lblId);

		textField = new JTextField();
		textField.setBounds(10, 36, 86, 20);
		dbPanel.add(textField);
		textField.setColumns(10);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(123, 11, 46, 14);
		dbPanel.add(lblName);

		textFieldName = new JTextField();
		textFieldName.setBounds(118, 36, 86, 20);
		dbPanel.add(textFieldName);
		textFieldName.setColumns(10);
	}
}
