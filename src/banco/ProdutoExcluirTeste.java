package banco;

public class ProdutoExcluirTeste {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		System.out.println(dao.excluir(1));
	}

}
