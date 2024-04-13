package semana05;

public class Impressao01 extends Thread {

	String texto = "Apostila de Java";

	@Override
	public void run() {
		Impressora.imprimir(texto);
	}
}
