package semana10;

import java.util.ArrayList;
import java.util.List;

public class Cargo {
	public int id;
	public String nome;
	public double tetoSalarial;
	// public Funcionario[] funcionarios;
	public List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void mostrar() {
		System.out.println("[" + id + "," + nome + "," + tetoSalarial + "]");
		for (Funcionario f : funcionarios) {
			System.out.println(f.nome);
		}
	}

	public void addFuncionario(Funcionario f) {
		funcionarios.add(f);
	}
}
