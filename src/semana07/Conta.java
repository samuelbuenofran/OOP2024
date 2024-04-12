package semana07;

public class Conta {
	public final int LIMITE_SAQUE = 1000;
	public final int LIMITE_DEPOSITO = 5000;
	private int numero;
	private double saldo;
	public String titular;
	public static String banco; //pertence a classe

	private String sql; //variavel auxiliar

	public Conta(int numero , double saldo, String titular) {
		// this.numero = numero;
		depositar(saldo);
		this.saldo = saldo;
		this.titular = titular;

	}

	public void consultar() {
		System.out.println(numero);
		System.out.println(titular);
		System.out.println(saldo);

	}
	/**
	 * Adiciona o valor recebido ao saldo
	 * @param valor
	 */
	public void depositar(double valor) {
		String men = "Deposito realizado com sucesso!";
		if(valor <= LIMITE_DEPOSITO) {
			saldo += valor;
		}
		else {
			men = "O valor do depósito não pode exceder " + LIMITE_DEPOSITO + ".";
		}
	}

	/**
	 * Retirada do saldo o valor recebido
	 * O valor deve ser <= 1000 de acordo com o limite
	 * @param valor
	 */
	public String sacar(double valor) {
		String men = "Saque realizado com sucesso!";
		if(valor<= LIMITE_SAQUE) {
			if(valor<=saldo) {
				saldo-=valor;	
			}else {
				men = "Saldo insuficiente!";
			}
		}
		else {
			men = "O saque não pode exceder " + LIMITE_SAQUE + ".";
		}
		return men;
	}
	
	/**
	 * Realiza a transferencia de valores entre contas
	 * @param c1 - conta a ser debitada
	 * @param c2 - conta a ser creditada
	 * @param valor - o valor da transferência
	 */
	public static void transferir(Conta c1, Conta c2, double valor) {
		c2.saldo += valor;
		c1.saldo -= valor;
	}
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	

}
