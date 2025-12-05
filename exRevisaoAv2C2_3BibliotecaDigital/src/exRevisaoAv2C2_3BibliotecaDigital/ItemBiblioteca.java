package exRevisaoAv2C2_3BibliotecaDigital;

import java.time.Year;

abstract class ItemBiblioteca { //classe abstrarta
	//atributos:
	String titulo;
	String autorOuEditora;
	int anoPublicacao;
	
	//CONSTRUTORES:
	public ItemBiblioteca(String titulo, String autorOuEditora, int anoPublicacao){
		this.titulo = titulo; //Construtor "titulo"
		this.autorOuEditora = autorOuEditora; //Construtor "autorOuEditora"
		this.anoPublicacao = anoPublicacao; //Construtor "anoPublicacao"
	}
	
	//MÉTODO --> ABSTRATO <-- sem implementação, que será sobrescrito pelas subclasses.
	public void exibirInformacoes(){
	}
	//OU pode usar:
	//public abstract void exibirInformacoes();
	
	//MÉTODO --> CONCRETO
	public int calcularIdadePublicacao() {
		int anoAtual = Year.now().getValue();
        return anoAtual - anoPublicacao;
	}
	
}
