package classes;

public class ValorVSReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //Atribuição por valor(tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2023);
		Data d2 = d1; //Atribuição por referencia(objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.mostrarData());
		System.out.println(d2.mostrarData());
		
		voltarDataParaValorPadra(d1);
		
		System.out.println(d1.mostrarData());
		System.out.println(d2.mostrarData());
	}
	
	static void voltarDataParaValorPadra(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
