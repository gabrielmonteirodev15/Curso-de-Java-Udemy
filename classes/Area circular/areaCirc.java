package classes;

public class areaCirc {

	double raio;
	static double pi = 3.14;
	

	areaCirc(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
	}
	double area() {
		return (raio * raio) * pi;
	}
}
