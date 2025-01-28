package fundamentos;
import java.util.Scanner;
public class Wrapper {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("1000");
		Long l = 1000000L;
		
		System.out.println("Digite um número : ");
		Integer e = Integer.parseInt(entrada.nextLine());
		System.out.println(e);
		
		System.out.println(b.byteValue());
		System.out.println(i);
		entrada.close();
	}
	
}
