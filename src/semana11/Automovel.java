
package semana11;

public class Automovel implements Motor, Porta {

	@Override
	public void ligar() {
		System.out.println("Ligando o automóvel");
		Motor m = new Aviao();
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o automóvel");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando o automóvel");
	}

	@Override
	public void frear() {
		System.out.println("Freando o automóvel");
	}

	@Override
	public void abrir() {
		System.out.println("Abrindo a porta do automóvel");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando a porta do automóvel");
	}

}
