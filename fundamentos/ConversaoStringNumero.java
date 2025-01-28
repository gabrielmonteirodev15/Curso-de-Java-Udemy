package fundamentos;

import java.util.Scanner;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		String caracter = entrada.next();
		
		int num = Integer.parseInt(caracter);
		
		entrada.close();
	}
}
