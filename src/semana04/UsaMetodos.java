package semana04;

public class UsaMetodos {

	public static void main() {
		// TODO Auto-generated method stub

		Metodos.imprimir();
		Metodos.imprimirFrase("Aprendendo Métodos");
		Metodos.imprimirConcatenado("Oi", "Pessoal");
		Impressora.printReverse("Hello World!");
		String people[] = { "João", "Maria", "José", "Ana", "Pedro" };
		Impressora.printPeople(people);
		Impressora.printUpperAndLower("Houstoun we have a problem!");

	}

}
