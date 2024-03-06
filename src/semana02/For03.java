/**
 *
 */
package semana02;

/**
 *
 */
public class For03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] v = { 4, 5, 3, 65, 7, 4, 7, 8, 4, 8, 9, 324, 76, 87, 45, 3, 6 };

		// Length property of arrays
		int tamanho = v.length; // Property, attribute
		String s = "Sérgio";
		int t = s.length(); // Method

		// Enhanced for loop
		// Percorre os elementos do array/vetor
		for (int i = 0; i < tamanho; i++) {
			System.out.println(i + " = " + v[i]);
		}

		// Alternative way to print the array
		for (int element : v) {
			System.out.println("Alt-printing: " + element);
		}

		// Percorre os elementos usando o iterator
		for (int x : v) {
			System.out.println(x);
		}

	}

}
