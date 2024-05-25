package banco;

import java.sql.SQLException;

import semana08_2.BD;

public class ConsultaProdutosFiltro {

	public static void main(String[] args) {
		BD bd = new BD();
		if (bd.getConnection()) {
			String sql = "select preco from produtos";
			try {
				bd.st = bd.con.prepareStatement(sql);

				bd.rs = bd.st.executeQuery();
				double total = 0;

				while (bd.rs.next()) {
					System.out.println(bd.rs.getDouble("preco"));
				}
				System.out.println("Soma dos preços = " + total);

				// Explanation: The SQL query is changed to sum the prices of the products
				sql = "select sum(preco) as total from produtos";
				// Explanation: The bd.con.prepareStatement method is called to prepare the SQL
				// query
				bd.st = bd.con.prepareStatement(sql);
				// Explanation: The bd.st.executeQuery method is called to execute the query
				bd.rs = bd.st.executeQuery();
				bd.rs.next();
				System.out.println("Soma dos preços 2 = " + bd.rs.getDouble("total"));

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
