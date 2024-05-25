package semana10;

import semana06.Motor;

public class UsaVeiculo {
	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		v.id = 1;
		v.modelo = "Fusca";
		v.ano = 1969;

		Motor m = new Motor();
		m.descricao = "100 CV potência";
		v.adicionarMotor(m); // agregação

		Lampada lampada = new Lampada();
		v.adicionarLampada(lampada);

		Veiculo v2 = new Veiculo();
		v2.adicionarMotor(m);
	}
}
