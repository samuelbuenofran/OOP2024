package semana11;

public class Descascador {

	public static void descascar(Fruta f) {
		f.descascar();
	}

	public static void main(String[] args) {
		Fruta fruta = new Laranja();
		descascar(fruta);
		fruta = new Abacaxi();
		descascar(fruta);
	}
}
