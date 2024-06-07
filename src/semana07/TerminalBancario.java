package semana07;

public class TerminalBancario {

	public static void main(String[] args) {

		Conta c1 = new Conta(1, 2000, "Sérgio");
		Conta c2 = new Conta(2, 1000, "Joana");

		Conta.banco = "Itau";
		c2.banco = "Bradesco";

		Conta.transferir(c1, c2, 200);
		c1.consultar();

		// Conta c1 = new Conta();
		// c1.consultar();
		// Conta c2 = new Conta(1,5000,"Sérgio");
		// System.out.println(c2.sacar(1000));
		// c2.consultar();
		// System.out.println(c2.sacar(300));
		// c2.consultar();

		// When static it belongs to the class

	}

}
