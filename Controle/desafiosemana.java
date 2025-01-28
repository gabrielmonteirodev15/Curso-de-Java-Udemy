package Controle;

import java.util.Scanner;

public class desafiosemana {

	public static void main(String[] args) {
		//Domingo -> 1
		//quarta -> 4
		//sabado -> 5
		int dianum = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva o dia da semana ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			dianum = 1;
		}
		else if(dia.equalsIgnoreCase("segunda")){
			dianum = 2;
		}
		else if(dia.equalsIgnoreCase("terça")){
			dianum = 3;
		}
		else if(dia.equalsIgnoreCase("quarta")){
			dianum = 4;
		}
		else if(dia.equalsIgnoreCase("quinta")){
			dianum = 5;
		}
		else if(dia.equalsIgnoreCase("sexta")) {
			dianum = 6;
		}
		else if(dia.equalsIgnoreCase("sabado")) {
			dianum = 7;
		}
		else {
			System.out.println("Numero invalido!");
			dianum = -1;
		}
		System.out.println("O número da semana do dia informado é " + dianum);
		entrada.close();
	}
}
