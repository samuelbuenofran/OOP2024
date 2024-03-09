package semana03;

import java.text.DecimalFormat;

public class Arredondamento {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			double n = Math.random() * 100;
			System.out.print(n + " --> ");
			System.out.print(Math.ceil(n) + " --> ");
			System.out.print(Math.floor(n) + " --> ");
			System.out.println(Math.round(n));

			// DecimalFormat df = new DecimalFormat("#.##");
			DecimalFormat df = new DecimalFormat();
			// Forces the zero value to be printed
			df.applyPattern("##.00");

			System.out.println("Using DecimalFormat");
			for (int k = 1; k <= 10; k++) {
				double p = Math.random() * 100;
				System.out.println(p + " --> " + df.format(p));
			}

		}

	}
}
