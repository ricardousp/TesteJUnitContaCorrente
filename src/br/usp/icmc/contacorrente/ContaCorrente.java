package br.usp.icmc.contacorrente;

public class ContaCorrente {

	private double saldo;

	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
		System.out.println("Depósito realizado com sucesso!");
	}

	public void sacar(double valorSaque) {
		if (valorSaque <= this.saldo) {
			saldo -= valorSaque;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente! Saque nao realizado.");
		}
	}

	public void transfere(ContaCorrente c2, double valor) {
		if (valor > 0 && c2 != null) {
			this.sacar(valor);
			c2.depositar(valor);
		} else {
			System.err.println("Valor de Conta Corrente 2 é null ou o valor do depósito é abaixo de zero!");
		}
	}

	public double consultaSaldo() {
		return saldo;
	}
}
