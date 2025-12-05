package exRevisaoAv2C2;
import java.util.ArrayList; //NECESSÁRIO para que ArrayList FUNCIONE!!!!!!!!!
//Testando execução através do arquivo EXECUTAVEL "Main.java"
public class Main {
    public static void main(String[] args) {

        // Criando um objeto Carro
        Carro meuCarro = new Carro();

        // Chamando o método mover()
        meuCarro.mover();
        
        //Implementando métodos abastecer() na classe Carro
        meuCarro.abastecer();
        meuCarro.abastecer(20); // chamando versão "int litros"
        /*chamando versão "int litros, CASO EXISTA uma variavel:
        int litros = 20;
        meuCarro.abastecer(litros);*/

        meuCarro.abastecer("Gasolina"); // chamando versão "String tipoCombustivel"
        /*chamando versão "String tipoCombustivel". CASO EXISTA uma variavel:
        String tipoCombustivel = "Etanol";
        meuCarro.abastecer(tipoCombustivel);*/

//=================================== ARRAY (Parte Importante) ==================================================      
        //Como criar um ARRAY(é uma lista LIMITADA ou RIGIDA ou "IMUTÁVEL"):
        Forma[] arrayDeForma = new Forma[2];
        arrayDeForma[0] = new Circulo();
        arrayDeForma[1] = new Retangulo();
        
        // Percorrendo o array e chamando método desenhar()
        for (int i = 0; i < arrayDeForma.length; i++) {
            arrayDeForma[i].desenhar();
    }
        //Passo a passo
        //1. for /*Utilize for*/
        //2. int i = 0 /*estabeleçe que a lista começa pelo primeiro item*/
        //3. i < arrayDeForma.length /*estabelece que a lista não deve ultrapassar o ultimo item*/
        //4. i++/*estabelece que a lista deve continuar depois de contar o primeiro item*/
        
//=================================== Criando um ARRAY LIST (Parte Importante) ==================================================   
        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<>();

        listaDeVeiculos.add(new Carro());
        listaDeVeiculos.add(new Moto());
        
        //Percorrer ArrayList
        for (int i = 0; i < listaDeVeiculos.size(); i++) {
            listaDeVeiculos.get(i).mover();
        }
            
 
        


  }
}
