package semana07;

public class Livro {

	private String titulo;
	private int qtdePaginas;
	private double preco;
	private boolean novo;
	
	public String toString() {
		return "Livro [titulo=" + titulo + ", qtdePaginas=" + qtdePaginas + "]";
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdePaginas() {
		return qtdePaginas;
	}
	public void setQtdePaginas(int qtdePaginas) {
		this.qtdePaginas = qtdePaginas;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isNovo() {
		return novo;
	}
	public void setNovo(boolean novo) {
		this.novo = novo;
	}



	//	public void setTitulo(String titulo) {
	//		this.titulo = titulo;
	//	}
	//	
	//	public void setQtdePaginas (int qtdePaginas) {
	//		this.qtdePaginas = qtdePaginas;
	//	}
	//	
	//	public void setPreco(double preco) {
	//		if(preco>0) {
	//			this.preco = preco;
	//		}
	//	}
	//	
	//	
	//	public String getTitulo() {
	//		return titulo;
	//	}
	//	
	//	
	//	public int getQtdePaginas() {
	//		return qtdePaginas;
	//	}
	//	
	//	public double getPreco() {
	//		return preco;
	//	}

}
