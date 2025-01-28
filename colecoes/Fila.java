package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e add -> adicionam elementos
		//Diferença é o comportamento quando a fila está cheio
		fila.add("Ana"); //Lança uma exceção
		fila.offer("Bia"); // Retorna false
		fila.offer("Carlos");
		fila.add("Rafaela");
		
		
		//Peek e Element -> obter o proximo elemento 
		//da fila sem remover
		
		//Diferença é o comportamento quando a fila está vazia
		System.out.println(fila.peek()); // Retorna false
		System.out.println(fila.element()); //Lança uma exceção
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
		
		
		//poll e remove -> obter o proximo elemento 
		//da fila removendo da lista
		System.out.println(fila.poll()); // Retorna false
		System.out.println(fila.remove()); //Lança uma exceção
	}
}
