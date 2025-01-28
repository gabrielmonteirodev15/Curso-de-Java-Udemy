package Controle;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		String conceito = "";
		int nota = 7;
		
		switch(nota) {
		case 10: case 9: //Dois case 
			conceito = "A";
			break; //utiliza o break para sair do switch assim que executar o bloco de codigo
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		default:
			conceito = "não informado";
		}
		
		System.out.println("Conceito é " + conceito);
	}
}
