package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {

	public static void main(String[] args) {
			
		double[] notasAluno = new double[3];
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.5;
		
		
		System.out.println(Arrays.toString(notasAluno));
		
		double total = 0;
		for(int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
		}
		
		System.out.println(total / 3);
	
		
		double[] notasAlunosB = {7.5, 6.9, 8.0, 10};
		
		for (int i = 0; i < notasAlunosB.length; i++) {
			
		}
	}
}
