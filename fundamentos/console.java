package fundamentos;

import java.util.Scanner;

public class console {

	public static void main(String[] args) {
		System.out.printf("Megasena : %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		
		//Cria um scanner 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome");
		//Armazena os dados 
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		System.out.printf("\n\n Bem vindo %s %s com idade de %d ", nome, sobrenome, idade);
		entrada.close();
	}
}
