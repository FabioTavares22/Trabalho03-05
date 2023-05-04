package Exercicio02;

public class ContaBancaria {
	public int saldo;
	public String titular;
	
	public int sacar (int valorSaque) {
		this.saldo -= valorSaque;
		return saldo;
	}
	
	public int depositar (int valorDeposito) {
		this.saldo += valorDeposito;
		return saldo;
	}
}
