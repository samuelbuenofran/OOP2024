package banco;

import java.sql.SQLException;

import semana08_2.BD;

public class ConsultaProdutos {

	public static void main(String[] args) {
		BD bd = new BD();
		if (bd.getConnection()) {
			String sql = "select id,nome,estoque,preco from produtos where id < ? and id > ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				// Define the value of the first parameter
				bd.st.setInt(1, 3);
				// Define the value of the second parameter
				bd.st.setInt(2, 1);
				bd.rs = bd.st.executeQuery();

				while (bd.rs.next()) {
					System.out.println(bd.rs.getInt(1));
					System.out.println(bd.rs.getString(2));
					System.out.println(bd.rs.getInt(3));
					System.out.println(bd.rs.getDouble(4));
					System.out.println("--------------------");
				}

				// bd.rs.next();
//				System.out.println(bd.rs.getInt("id"));
//				System.out.println(bd.rs.getString("nome"));
//				System.out.println(bd.rs.getInt("estoque"));
//				System.out.println(bd.rs.getDouble("preco"));
//
//				bd.rs.next();
//				System.out.println(bd.rs.getInt("id"));
//				System.out.println(bd.rs.getString("nome"));
//				System.out.println(bd.rs.getInt("estoque"));
//				System.out.println(bd.rs.getDouble("preco"));

			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
}

/*
 * A BD object is created and its getConnection method is called. If the
 * connection is successful, a SQL query is created and prepared.
 * 
 */
