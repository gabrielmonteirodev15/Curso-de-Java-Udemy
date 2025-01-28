package colecoes;

import java.util.ArrayList;

import arrays.Foreach;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Manu"));
		
		lista.remove(1);
		
		System.out.println(lista.contains(new Usuario("Lia")));
		
		for(Usuario u :lista) {
			System.out.println(u.toString());
		}
		
	}
}
