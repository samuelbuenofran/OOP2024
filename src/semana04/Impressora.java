package semana04;

/**
 * Classe para realizar operações matemáticas
 * 
 * @version 1.0
 * @since 1.0
 * 
 */
public class Impressora {

	/**
	 * Recebe uma palavra e imprime ela na horizontal
	 * 
	 * @param palavra - A palavra a ser impressa em tela
	 */
	public static void imprimirVertical(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}

	/**
	 * Recebe um texto e o imprime n vezes em tela
	 * 
	 * @param texto      -
	 * @param quantidade -
	 */
	public static void imprimirCopias(String texto, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.println(texto);
		}
	}

	/*
	 * Sugestão de métodos: 1. Imprimir em ordem inversa (espelho) 2. Receber nomes
	 * de pessoas e imprimir uma pessoa em cada linha 3. Receber uma frase e
	 * imprimir todas as letras em maiúsculas ou todas as letras em minúsculas. 4.
	 * Receber uma frase e imprimir a frase sem as vogais 5. Receber uma frase e
	 * mostrar a quantidade de letras existentes
	 * 
	 */
}
