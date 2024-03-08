package semana03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Excecao04 {

	public static void main(String[] args) {

		try {
			PrintWriter pw = new PrintWriter("C:/temp/arquivo.txt");
			pw.println("Minhas alunas lindas:");
			pw.println("Leidiane");
			pw.println("Isabella");
			pw.println("Letícia");
			// adicionei dados
			JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
			pw.close();
		} catch (FileNotFoundException e) {

			System.out.println("Falha na criação do arquivo." + e);
		}
	}

}
