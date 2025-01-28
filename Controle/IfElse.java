package Controle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o número ");
		String valor = entrada.next();
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par");
		}
		else if(numero % 2 == 1) {
			System.out.println("Número impar");
		}
	}
}
