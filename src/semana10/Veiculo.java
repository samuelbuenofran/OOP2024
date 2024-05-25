package semana10;

import semana06.Motor;

public class Veiculo {
	public int id;
	public String modelo;
	public int ano;
	public Motor motor;
	public Lampada lampada;

	public adicionarLampada(Lampada lampada) {
		this.lampada = lampada;
	}

	public void adicionarMotor(Motor motor) {
		this.motor = motor;
	}
}
