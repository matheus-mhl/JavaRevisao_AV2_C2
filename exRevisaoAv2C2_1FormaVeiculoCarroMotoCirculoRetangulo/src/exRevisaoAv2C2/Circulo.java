package exRevisaoAv2C2;

public class Circulo extends Forma { //class "Circulo" herda class ABSTRATA "Forma"
	@Override //SOBREESCREVENDO método desenhar()
	public void desenhar() { //Implemetando metodo que ja existe na class abstract "Forma". Por tanto AQUI não é necessario utilizar "abstract" antes de void
		System.out.println("Desenhando um CIRCULO");
	}

}
