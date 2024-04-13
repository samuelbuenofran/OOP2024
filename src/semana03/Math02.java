package semana03;

public class Math02 {

	public static void main(String[] args) {

		// Generates 6 numbers

		int cartao = 1;

		while (cartao <= 10) {
			System.out.print("Cartao " + cartao + ": ");
			for (int a = 1; a <= 6; a++) {
				// Becareful with precedence
				// The 1+ prevents zero from being chosen
				System.out.print(1 + (int) (Math.random() * 60) + " "); // pseudo aleatório
			}
			System.out.println();
			cartao++;
		}
	}

}
