package semana10;

public class UsaCargo {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		f1.id = 1;
		f1.nome = "Alex";
		f2.id = 2;
		f2.nome = "Sandra";

		Cargo c = new Cargo();
		c.id = 1;
		c.nome = "Analista";
		c.tetoSalarial = 5000;
		c.addFuncionario(f1);
		c.addFuncionario(f2);
		c.mostrar();

	}
}
