package banco;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import semana08_2.BD;

public class ConsultaProdutosSomaTotal {

	public static void main(String[] args) {
		BD bd = new BD();
		if (bd.getConnection()) {
			String sql = "select * from produtos where nome like ?";
			try {
				String s = JOptionPane.showInputDialog("Digite o filtro");
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, "%" + s + "%");
				bd.rs = bd.st.executeQuery();

				while (bd.rs.next()) {
					System.out.println(bd.rs.getInt(1));
					System.out.println(bd.rs.getString(2));
					System.out.println(bd.rs.getInt(3));
					System.out.println(bd.rs.getDouble(4));
					System.out.println("--------------------");
				}

			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				bd.close();
			}
		}
	}
}

/*
 * A BD object is created and its getConnection method is called. If the
 * connection is successful, a SQL query is created and prepared.
 * 
 */
