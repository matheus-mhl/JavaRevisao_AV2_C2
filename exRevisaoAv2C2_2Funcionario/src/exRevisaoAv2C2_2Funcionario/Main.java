package exRevisaoAv2C2_2Funcionario;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>(); //criando array list
		listaDeFuncionarios.add(new Desenvolvedor());//adicionando objeto "Desenvolvedor" a lista
		listaDeFuncionarios.add(new Gerente());//adicionando objeto "Gerente" a lista

		//Percorrendo método
        for (int i = 0; i < listaDeFuncionarios.size(); i++) {
            double resultado = listaDeFuncionarios.get(i).calcularPagamento(500);
            
            System.out.println("Essa é a lista de Funcionarios: " + resultado);
        }
	}

}
