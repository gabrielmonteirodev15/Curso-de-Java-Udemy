package classes;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Davi Silva";
		u1.email = "davi.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Davi Silva";
		u2.email = "davi.silva@ezemail.com.br";
		
		System.out.println(u1 == u2); //Compara o endereço de memoria do obj
		System.out.println(u1.equals(u2)); 
		
		
		
	}
}
