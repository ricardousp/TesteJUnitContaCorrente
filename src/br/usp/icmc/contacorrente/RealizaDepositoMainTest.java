package br.usp.icmc.contacorrente;

public class RealizaDepositoMainTest {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100.0);
		double saldoAtual = cc.consultaSaldo();
		System.out.println("Saldo Atual: " + saldoAtual);
	}
	
}
