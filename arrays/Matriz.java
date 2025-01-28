package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdNotas = entrada.nextInt();
		
		double[][] notas = new double[qtdAlunos][qtdNotas];
		
		double total =0;
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d ", j + 1 , i + 1);
				notas[i][j] = entrada.nextDouble();
				total += notas[i][j];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.printf("A media da turma é %.2f", media);
		entrada.close();
	}
}
