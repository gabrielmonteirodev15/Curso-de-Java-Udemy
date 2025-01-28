package Controle;

import java.util.Scanner;

public class IF {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma media ");
		
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7){
			System.out.println("Aprovado");
		}
		if(media < 7 && media >= 4.5){
			System.out.println("Aluno de recuperação ");
		}
		
		//Podemos colocar a condição dentro de uma variavel
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		
		//Pedimos para verificar se o conteudo da variavel é verdadeira
		if(criterioReprovacao) {
			System.out.println("Aluno reprovado ");
		}
		entrada.close();
	}
}
