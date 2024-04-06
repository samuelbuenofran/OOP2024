package semana06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {

	private String ra, nome, curso;

	public Aluno(String ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "[" + "RA: " + ra + " Nome: " + nome + " Curso: " + curso + "]";
	}

	/**
	 * Grava em disco o estado atual do objeto Persistência
	 * 
	 * @return
	 */
	public String gravar() {
		String men = "Objeto gravado com succeso!";
		try {
			FileOutputStream fos = new FileOutputStream(ra + ".obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.flush();
			oos.close();

			// A classe FileOutputStream é usada para gravar dados em um arquivo
			// A classe ObjectOutputStream é usada para gravar objetos em um arquivo
			// O método writeObject() é usado para gravar um objeto em um arquivo
			// O método flush() é usado para limpar o buffer
			// O método close() é usado para fechar o arquivo

			// English:
			// The FileOutputStream class is used to write data to a file
			// The ObjectOutputStream class is used to write objects to a file
			// The writeObject() method is used to write an object to a file
			// The flush() method is used to clear the buffer
			// The close() method is used to close the file

		} catch (IOException erro) {
			men = "Falha na gravação do objeto!" + erro;
		}

		return men;
	}

	/**
	 * Grava em disco o estado atual do objeto Persistência
	 * 
	 * @return
	 */
	public String ler() {
		Aluno a = null;
		try {
			FileInputStream fos = new FileInputStream(ra + ".obj");
			ObjectInputStream oos = new ObjectInputStream(fos);
			a = (Aluno) oos.readObject();
			oos.close();

		} catch (Exception erro) {
		}

		return a;
	}
}
