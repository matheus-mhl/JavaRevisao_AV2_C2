package exRevisaoAv2C2_3BibliotecaDigital;

public class Livro extends ItemBiblioteca {
	//atributo
	int numeroPaginas;
	
	//Métodos
	//Construtor
	public Livro (String titulo, String autorOuEditora, int anoPublicacao, int numeroPaginas){
	super(titulo, autorOuEditora, anoPublicacao);
	this.numeroPaginas=numeroPaginas;
	}
		
	//Sobrescreva exibirInformacoes() para imprimir: Título, Autor, Ano de Publicação, Número de Páginas
	@Override
	public void exibirInformacoes() {
		System.out.println("--------- Livro ------------------");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autorOuEditora);
		System.out.println("Ano: " + this.anoPublicacao);
		System.out.println("Pags: " + this.numeroPaginas);
	}
}
