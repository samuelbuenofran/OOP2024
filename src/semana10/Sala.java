package semana10;

public class Sala extends Comodo {
	public float metros;
	public Lampada lampada;

	public Sala() { // uma composição
		// lampada = new Lampada();
	}

	public void acenderLampada() {
		lampada.ligar();
	}
}