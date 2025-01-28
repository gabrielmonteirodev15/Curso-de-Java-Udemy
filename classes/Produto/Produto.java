package classes;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial){ //Construtor que vai exigir o nome da produto
		nome = nomeInicial;
	}
	
	Produto(){ //Construtor padrão da classe produto
		
	}
	double precoComDesconto() {
		
		return preco * (1 - desconto);
	}
}
