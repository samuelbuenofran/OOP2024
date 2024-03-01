/**
 * 
 */
package semana02;

/**
 * 
 */
public class Ternario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// Three ways of doing the same thing

		// Version 1: If-else
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

		// Version 2: Ternary operator
		int m = a > b ? a : b;
		// Is a greater than b? If true, m = a, else m = b

		// Version 3: Straight to the console
		System.out.println(a > b ? a : b);

		System.out.println(a > b ? a : b > a ? b : "Iguais"); // Nested ternary operator

	}

}
