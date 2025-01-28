package fundamentos;

public class ConversorTemp {

	public static void main(String[] args) {
		
		double fah = 86;
		final double div = 5/9.0;
		final double num = 32;
		double cer = (fah - num) * div;
		
		System.out.println("A temperatura em fah " + fah + " é convertida para celsius " + cer);
	}
}

