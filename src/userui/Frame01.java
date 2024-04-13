package userui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
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
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 566);

		// Creates a new JMenuBar object called menuBar
		JMenuBar menuBar = new JMenuBar();

		// Uses the setJMenuBar() method to add the menuBar object to the frame
		setJMenuBar(menuBar);

		// Adds a new menu option to the menuBar
		// PAY ATTENTION, this is not a JMenuItem, but a JMenu
		// The JMenu is a menu that can contain other menus or menu items
		// Additionally, do not confuse its object name with its title
		JMenu mnExemplos = new JMenu("Exemplos");
		menuBar.add(mnExemplos);

		////////////////////////////////////////
		// Adds a new item to the menu
		// This will be visible if the user clicks the "Exemplos" menu
		JMenuItem miFor = new JMenuItem("For");

		// This adds a "trigger" to the item whenever the user clicks it
		// In this case it will generate a panel by setting the content pane to a new
		// PainelFor object
		// The frame will be refreshed and repainted
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

		// This adds the JMenuItem to the JMenu
		// So, from the JMenuItem object declaration to this line, you have created a
		// new menu item
		mnExemplos.add(miFor);
		//////////////////////////////////////////

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
		/////////////////

		JMenuItem miIf = new JMenuItem("If");
		mnExemplos.add(miIf);

		JMenuItem miSorteio = new JMenuItem("Sorteio");
		mnExemplos.add(miSorteio);

		// Exercises

		// Adds a new item to the menu
		// Creates a new JMenu object called mnExercicios
		JMenu mnExercicios = new JMenu("Exercícios");

		// Uses the add() method to add the mnExercicios object to the menuBar
		// Note that before you add the mnExercicios object to the menuBar, you must
		// create the mnExercicios object
		menuBar.add(mnExercicios);

		// Adds a new JMenuItem
		JMenuItem mnExe01 = new JMenuItem("Exe01");

		mnExe01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCalc p = new PainelCalc();
				frame.setContentPane(p);
				frame.revalidate(); // F5 refresh
				frame.repaint();
			}
		});
		mnExercicios.add(mnExe01);

		JMenuItem mnExe02 = new JMenuItem("Exe02");
		mnExe02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelNotas p = new PainelNotas();
				frame.setContentPane(p);
				frame.revalidate(); // F5 refresh
				frame.repaint();
			}
		});
		mnExercicios.add(mnExe02);

		JMenuItem mnExe03 = new JMenuItem("Exe03");
		mnExe03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelMetros p = new PainelMetros();
				frame.setContentPane(p);
				frame.revalidate(); // F5 refresh
				frame.repaint();
			}
		});
		mnExercicios.add(mnExe03);

		JMenuItem mnExe04 = new JMenuItem("Exe04");
		mnExe04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCirc p = new PainelCirc();
				frame.setContentPane(p);
				frame.revalidate(); // F5 refresh
				frame.repaint();
			}
		});
		mnExercicios.add(mnExe04);

		JMenuItem mnExe05 = new JMenuItem("Exe05");
		mnExe05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelQuad p = new PainelQuad();
				frame.setContentPane(p);
				frame.revalidate(); // F5 refresh
				frame.repaint();
			}
		});
		mnExercicios.add(mnExe05);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

	// End of exercises

	/*
	 * A very important note is that this frame is just for navigating to the
	 * appropriate frames. All functionalities are implemented in the PainelFor,
	 * PainelMedia, PainelCalc, etc.
	 */

}
