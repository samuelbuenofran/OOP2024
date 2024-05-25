package banco;

import java.sql.SQLException;
import java.util.List;

public class ProdutoDAO {

	private BD bd;
	private String sql, men;

	public ProdutoDAO() {
		bd = new BD();
	}

	public String gravar(Produto p) {
		sql = "INSERT INTO produtos VALUES (?, ?, ?, ?)";
		men = "Produto inserido com sucesso";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, p.getId());
			bd.st.setString(2, p.getNome());
			bd.st.setInt(3, p.getEstoque());
			bd.st.setDouble(4, p.getPreco());
			int n = bd.st.executeUpdate();
			System.out.println("Linhas inseridas: " + n);
		} catch (SQLException e) {
			sql = "update produtos SET nome = ?, estoque = ?, preco = ?" + "where id = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, p.getNome());
				bd.st.setInt(2, p.getEstoque());
				bd.st.setDouble(3, p.getPreco());
				bd.st.setInt(4, p.getId());
				int n = bd.st.executeUpdate();
				System.out.println("Linhas alteradas: " + n);
				if (n == 1) {
					men = "Produto alterado com sucesso";
				} else {
					men = "Produto não encontrado!";
				}
			} catch (SQLException e1) {
				men = "Falha " + e1;
			}
		} finally {
			bd.close();
		}
		return men;
	}

	public String excluir(int id) {
		sql = "delete from produtos where id = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, id);
			int n = bd.st.executeUpdate();
			System.out.println("Linhas excluidas: " + n);
			if (n == 1) {
				men = "Produto alterado com sucesso";
			} else {
				men = "Produto não encontrado!";
			}
		} catch (SQLException e) {
			men = "Falha " + e;
		} finally {
			bd.close();
		}
		return men;
	}

	public List<Produto> get() {
		return null;
	}

}

// Path: src/banco/ProdutoDAO.java