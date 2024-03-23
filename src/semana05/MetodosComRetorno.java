package semana05;

public class MetodosComRetorno {

	/**
	 * Método que conta as vogais de uma string
	 * 
	 * @param s - a string
	 * @return - a quantidade de vogais
	 */
	public static int contarVogais(String s) {
		int cont = 0;
		return cont;
	}

	public static void main(String[] args) {
//		String s = "Estamos estudando programação";
//		System.out.println(contarVogais(s));
		int[] vetor = { 1, 2, 3, 4, 5 };
		System.out.println(soma(vetor));
		System.out.println(soma(1));

	}

	public static void contar(int limite) {
		for (int a = 1; a <= limite; a++) {
			System.out.println(a);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}

	public static double soma(double... n) { // parâmetro opcionais
		int total = 0;
		for (int i = 0; i < n.length; i++) {
			total += n[i];
		}
		return total;
	}

	public static int soma(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}

	/**
	 * Método que recebe dois valores e retorna sua soma
	 * 
	 * @param v1 - o valor 1
	 * @param v2 - o valor 2
	 * @return - a soma dos valores
	 */
	public static int soma(int v1, int v2) {
		return v1 + v2;
	}

}
