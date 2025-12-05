/*1. Herança e Sobrescrita (Conceitos Básicos)
Nível: Simples
O foco é estabelecer a relação de herança (extends) e a implementação básica de um método herdado.
Objetivos:*/
package exRevisaoAv2C2;

//1) Crie a classe base Veiculo. Deve ter um método mover() que imprime: "O veículo está se movendo."
/*Quando falamos “classe base”, significa que essa classe será a mãe, ou superclasse, da qual outras vão herdar no futuro (como Carro).*/
public class Veiculo {
	  public void mover() { //Criando método "mover" da classe "Veiculo"
	        System.out.println("Classe base");
	  }
}
