package semana05;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Paralelo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Paralelo frame = new Paralelo();
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
	public Paralelo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnIniciar = new JButton("New button");
		btnIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Thread t1 = new Thread(new Runnable() {
					@Override
					public void run() {
						for (int a = 1; a <= 10; a++) {
							tf1.setText("" + a);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e1) {
							}
						}
					}
				});

				Thread t2 = new Thread(new Runnable() {
					@Override
					public void run() {
						for (int a = 10; a >= 1; a--) {
							tf2.setText("" + a);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e1) {
							}
						}
					}
				});

				t1.start();
				t2.start();

			}
		});
		btnIniciar.setBounds(156, 154, 89, 23);
		contentPane.add(btnIniciar);

		tf1 = new JTextField();
		tf1.setBounds(48, 54, 96, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);

		tf2 = new JTextField();
		tf2.setBounds(223, 54, 96, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);
	}
}
