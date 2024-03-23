package semana05;

public class Impressora {
	// token
	public synchronized static void imprimir(String texto) {
		for (int i = 0; i < 10; i++) {
			System.out.println(texto + " - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
