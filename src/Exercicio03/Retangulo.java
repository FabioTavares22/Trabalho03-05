package Exercicio03;

public class Retangulo {
	public int base;
	public int altura;
	
	public int area(int valorBase, int valorAltura, int total) {
		this.base += valorBase; 
		this.altura += valorAltura;
		
		total = base * altura;
		
		return total;
	}
}
