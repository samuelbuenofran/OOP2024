package semana08;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		System.out.println(p.nome);
		System.out.println(p.getClass());

		PessoaFisica pf = new PessoaFisica();
		pf.digitar();

		Funcionario f = new Funcionario();
		f.digitar();

//		PessoaFisica pf = new PessoaFisica();
//		System.out.println(pf.nome);
//		System.out.println(pf.apelido);
//		// System.out.println(pf.codigo);
//		pf.setCodigo(100);
//		System.out.println(pf.getCodigo());
	}

}
