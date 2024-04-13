package semana03;

public class Excecao03 {

	public static void main(String[] args) {
		String[] nomes = { "Leidiane", "João", "Samuel" };
		// nomes[0]="Leidiane";...[0],[1],[2]

		try {
			for (int i = 0; i <= 2; i++) {
				System.out.println(nomes[i]);
				Thread.sleep(1000);
			}
		} catch (ArrayIndexOutOfBoundsException erro) {
			System.out.println("Indice invalido");

		} catch (InterruptedException erro) {
			System.out.println(erro);
		} finally {
			// finalizar recursos
			System.out.println("Finalização do try");
		}

	}

}
