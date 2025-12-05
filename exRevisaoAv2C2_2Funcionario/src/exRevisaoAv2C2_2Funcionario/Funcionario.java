package exRevisaoAv2C2_2Funcionario;

public class Funcionario { //criando classe pai "Funcionario"
	double salarioBase; // criando ATRIBUTO
	
	//criando método "sobrecarregado" = OVERLOAD
	public double calcularPagamento() { //Primeiro método apenas salarioBase
		return salarioBase;
	}
	public double calcularPagamento(double bonus) { //Segundo metodo salarioBase + bonus
		return salarioBase + bonus;
	}
}
