package Controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o tekki shodan");
		case "roxa":
			System.out.println("Sei o heian godan");
		case "laranja":
			System.out.println("Sei o heian sandan");
		}
	}

}
