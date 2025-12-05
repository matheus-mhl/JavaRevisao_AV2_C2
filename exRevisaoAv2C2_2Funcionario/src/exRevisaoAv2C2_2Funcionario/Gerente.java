package exRevisaoAv2C2_2Funcionario;

public class Gerente extends Funcionario {
	@Override
	public double calcularPagamento(double bonus){
		return super.calcularPagamento(bonus) + 1000.00; //"super" serve para acessar a classe PAI(nesse caso "Funcionario"). //calcularPagamento é o metodo da classe PAI "Funcionario"
	}

}
