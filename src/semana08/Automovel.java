package semana08;

public class Automovel extends Veiculo {

	public String placa;

	public Automovel(String cor, String marca, String placa) {
		super(cor, marca);
		this.placa = placa;

	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Placa: " + placa);
	}

}

/* I hate sand, it's coarse, rough, irritating and it gets everywhere. */
