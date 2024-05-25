package banco;

public class ProdutoIncluirTeste {

	public static void main(String[] args) {
		Produto p = new Produto(5, 100, "Sabão 2", 3.23);
		ProdutoDAO dao = new ProdutoDAO();
		System.out.println(dao.gravar(p));
	}

}
