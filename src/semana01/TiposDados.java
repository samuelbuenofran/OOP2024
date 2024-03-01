package semana01;

public class TiposDados {

	public static void main(String[] args) {

		// tipos primitivos
		int a = 10;
		float nota = 7.8f;
		double d = 7.8;
		char c = 'A';
		byte b1 = 1;
		System.out.println(a);
		// Type conversion, widening casting
		double x = a;

		// Narrowing casting
		// Grab the integer part of d
		int y = (int) d;

		// classe
		String s = "Sérgio";
		System.out.println(s);
		System.out.println(s.length());

		String v = "100"; // 100
		int valor = Integer.parseInt(v);
		float nota = Float.parseFloat(v);
		double media = Double.parseDouble(v);

		// Other methods to convert to String
		String ss = String.valueOf(a);
		String sss = "" + a;

	}

}
