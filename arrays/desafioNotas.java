package arrays;

import java.util.Scanner;

public class desafioNotas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos espaços terá o array");
		int i = entrada.nextInt();
		
		
		double[] notas = new double[i];
		
		for(int j = 0; j < notas.length; j++) {
			System.out.println("Informe a nota numero " + (j+1));
			notas[j] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		total = total / i;
		entrada.close();
		
		System.out.printf("A media da nota é %.2f", total);
		
	}
}
