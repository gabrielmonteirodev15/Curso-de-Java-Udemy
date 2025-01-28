package classes;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(comida c1) {
		if(c1 != null) {
			this.peso += c1.pesoComida;			
		}
	}
}
