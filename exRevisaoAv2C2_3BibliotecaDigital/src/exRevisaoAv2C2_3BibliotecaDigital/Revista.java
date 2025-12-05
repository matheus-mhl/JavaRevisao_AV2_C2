package exRevisaoAv2C2_3BibliotecaDigital;

public class Revista extends ItemBiblioteca {
	//atributo
	int numeroEdicao;
	
	//Métodos
	//Construtor deve chamar o construtor da superclasse e inicializar numeroEdicao.:
	public Revista (String titulo, String autorOuEditora, int anoPublicacao, int numeroEdicao) {
		super(titulo, autorOuEditora, anoPublicacao);
		this.numeroEdicao = numeroEdicao;
	}
	
	//Sobrescreva exibirInformacoes() para imprimir: Título, Editora, Ano de Publicação, Número da Edição
	@Override
	public void exibirInformacoes(){
		System.out.println("--------- Revista ------------------");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autorOuEditora);
		System.out.println("Ano: " + this.anoPublicacao);
		System.out.println("Pags: " + this.numeroEdicao);
	}

}
