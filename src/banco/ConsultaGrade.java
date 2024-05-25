package banco;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import semana08_2.BD;
import services.MyTableModel;

public class ConsultaGrade extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTable tbProdutos;
	private DefaultTableModel model;
	private JScrollPane spProdutos;
	private JTextField tfFiltro;
	private BD bd;

	public ConsultaGrade() {
		setTitle("Consulta Produtos");
		setBounds(100, 100, 600, 500);
		setLayout(new BorderLayout());

		tbProdutos = new JTable();
		bd = new BD();
		if (bd.getConnection()) {
			carregarTabela();
		} else {
			JOptionPane.showMessageDialog(spProdutos, "Falha na conexão");
			System.exit(0);
		}
	}

	private void carregarTabela() {
		String sql = "select * from produtos";
		model = MyTableModel.getModel(bd, sql);
		tbProdutos.setModel(model);
		spProdutos = new JScrollPane(tbProdutos);
		add(spProdutos, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		ConsultaGrade cg = new ConsultaGrade();
		cg.setVisible(true);
		cg.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JTextField getTfFiltro() {
		return tfFiltro;
	}

	public void setTfFiltro(JTextField tfFiltro) {
		this.tfFiltro = tfFiltro;
	}
}
