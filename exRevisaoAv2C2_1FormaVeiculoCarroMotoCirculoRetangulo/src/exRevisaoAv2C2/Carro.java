package exRevisaoAv2C2;
//2) Crie a classe filha Carro que herda de Veiculo.
//3) Sobrescreva (@Override) o método mover() na classe Carro para imprimir: "O carro está acelerando."

public class Carro extends Veiculo { //Classe filha "Carro criada". E depois usando "extends", para herdar da classe pai "Veiculo"
	@Override //Usando Override para sobreeescrever o método
	public void mover() { //Criando método "mover" da classe "Veiculo"
        System.out.println("O carro está acelerando!!"); //Imprimindo o método "O carro está acelerando!!" 
	}
	//Sobrecarga1
    public void abastecer() { //O método abastecer() sem parâmetros é a primeira parte da SOBRECARGA.
    	System.out.println("Abastecendo com combustivel comum.");
	}
    //Sobrecarga2
    public void abastecer(int litros) { //criando outra versão com um parâmetro diferente. Dessa forma virando DE FATO uma "sobrecarga(Overloading)"
    	System.out.println("Abastecendo " + litros + " litros de combustivel");
    }
    //Sobrecarga3
    public void abastecer(String tipoCombustivel) {
    	System.out.println("Abastecendo com " + tipoCombustivel);
    }
}
