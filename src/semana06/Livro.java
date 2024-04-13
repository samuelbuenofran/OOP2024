package semana06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Livro {

	Scanner sc = new Scanner(System.in);

	private int isbn;
	private String titulo;
	private double preco;

	public void mostrar() {
		System.out.println(isbn + "-" + titulo + "-" + preco);
	}
	// default????
	// comes from French "de faite" = "by default"

	public Livro() { // default????

	}

	public Livro(String titulo) {
		this.titulo = titulo;
	}

	public Livro(int isbn, String titulo, double preco) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
	}

	public Livro(int isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
	}

//	public Livro(String t) {
//		// atributo recebe parametro
//		titulo = t;
//
//	}

	@Override
	public String toString() {
		return "[" + isbn + "," + titulo + "," + preco + "]";
	}

	// meio esquisito
	public void digitar() {
		// You don't need "this" keyword here because there are no parameters with the
		// same name as the attributes
		isbn = Integer.parseInt(JOptionPane.showInputDialog("Digite o ISBN:\n"));
		titulo = JOptionPane.showInputDialog("Digite o título:\n");
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço:\n"));
	}

}
