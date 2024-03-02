import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Frame01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Frame01 frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					frame = new Frame01();
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
	public Frame01() {
		setResizable(false);
		setTitle("Minha Aplicação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 566);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnExemplos = new JMenu("Exemplos");
		menuBar.add(mnExemplos);

		// Adds a new item to the menu
		JMenuItem miFor = new JMenuItem("For");
		miFor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(mnExemplos, "For");
				PainelFor p = new PainelFor();
				frame.setContentPane(p);
				frame.revalidate(); // F5 refresh
				frame.repaint();

			}
		});
		mnExemplos.add(miFor);

		// Adds a new item to the menu
		JMenuItem miWhile = new JMenuItem("Media");
		miWhile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelMedia p = new PainelMedia();
				frame.setContentPane(p);
				frame.revalidate(); // F5 refresh
				frame.repaint();
			}
		});
		mnExemplos.add(miWhile);

		JMenuItem miIf = new JMenuItem("If");
		mnExemplos.add(miIf);

		JMenuItem miSorteio = new JMenuItem("Sorteio");
		mnExemplos.add(miSorteio);

		JMenu mnExercicios = new JMenu("Exercícios");
		menuBar.add(mnExercicios);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
