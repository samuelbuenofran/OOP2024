package semana05;

public class Recursividade {

	public static void somatoria(int n) { // 5 + 4 + 3 + 2 + 1
		int total = 0;
		for (int a = 1; a <= n; a++) {
			total += a;
		}
		System.out.println(total);
	}

	public static int somatoriaRecursivo(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + somatoriaRecursivo(n - 1);
		}
	}

	// I'm really sorry for this, but I'm not able to write this code in English.
	// English is much better than Portuguese for programming. :)
	// Everybody should learn English to program.
	// Brazilians are really good at programming, but they are not good at English.
	// Except me, of course. :D.
	// I'm kidding.
	// I'm not that good at programming, but I'm good at English.

	public static void main(String[] args) {
		somatoria(5);
		System.out.println(somatoriaRecursivo(10));
	}

}
