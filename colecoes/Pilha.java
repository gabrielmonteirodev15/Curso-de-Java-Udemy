package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livro = new ArrayDeque<String>();
		
		livro.add("O pequeno Príncipe");
		livro.push("Até o ultimo");
		
		
		for (String l : livro) {
			System.out.println(l);
		}
		
		
		System.out.println(livro.peek());
		System.out.println(livro.element());
		
		System.out.println(livro.poll());
		System.out.println(livro.pop());
		
		//livro.size();
		//livro.clear();
		//livro.contains();
		//livro.isEmpty();
		
		
	}
}
