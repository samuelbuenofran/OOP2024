package semana05;

public class Impressao02 extends Thread {

	String texto = "Apostila de Python";

	@Override
	public void run() {
		Impressora.imprimir(texto);
	}
}
