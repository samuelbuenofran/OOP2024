package semana06;

public class UsaPincel {
	public static void main(String[] args) {
		Pincel pincel01; // declaração
		pincel01 = new Pincel(); // instanciação
		pincel01.mostrar();

		pincel01.cor = "azul";
		pincel01.comprimento = 100;
		pincel01.preco = 3.43;
		pincel01.carga = 100;
		pincel01.mostrar();
		// Pincel.mostrar(); // não funciona

		Pincel pincel02 = new Pincel(); // declaração e instanciação
		pincel02.cor = "verde";
		pincel02.comprimento = 95;
		pincel02.preco = 3.90;
	}
}
