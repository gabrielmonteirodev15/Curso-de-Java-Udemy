package classes;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		p1.preco = 4356.89;
		
		var p2 = new Produto("Caneta preta");
		p2.preco = 12.56;

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double media = (precoFinal + precoFinal2) / 2;
		System.out.printf("Media do carrinhoo = R$%.2f", media);
	}
}
