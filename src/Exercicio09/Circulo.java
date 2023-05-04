package Exercicio09;

public class Circulo {
	public int raio;
	public float pi;
	
	public float area(int valorRaio, int valorPi, float total, int quadrado) {
		this.raio += valorRaio;
		this.pi += valorPi;
		quadrado = raio * raio;
		
		total = quadrado * pi;
		
		return total;
	}
}
