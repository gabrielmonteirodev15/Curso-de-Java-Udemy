package classes;

public class valorNulo {
	
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.mostrarData());
		}
	
		String s2 = Math.random() > 0.5 ? "opa" : null;
				
		if(s2 != null) {
			System.out.println(s2.concat("???"));
		}
	}
}
