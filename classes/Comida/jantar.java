package classes;

public class jantar {
	
	public static void main(String[] args) {
		comida c1 = new comida("Lasanha", 0.751);
		
		Pessoa p1 = new Pessoa("Gabriel", 70.00);
		
		p1.comer(c1);
		
		System.out.println(p1.peso);
		
		comida c2 = new comida("feizao", 0.123);
		p1.comer(c2);
		
		System.out.printf("%.2f",p1.peso);
	}
}
