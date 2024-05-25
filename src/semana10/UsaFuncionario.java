package semana10;

public class UsaFuncionario {
	Cargo c = new Cargo();
	c.id = 1;
	c.nome = "Analista";
	c.tetoSalarial = 5000;
	
	Funcionario f1 = new Funcionario();
	Funcionario f2 = new Funcionario();
	f1.id = 1;
	f1.nome = "Alex";
	f2.id = 2;
	f2.nome = "Sandra";
	f1.cargo = c;
	f2.cargo = c;
	
	
	// Why is it that when something happens it's always you three?
	// Believe me, Professor, I've been asking myself the same question for six years.
	// - Harry Potter and the Prisoner of Azkaban
}
