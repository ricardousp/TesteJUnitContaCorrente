package br.usp.icmc.contacorrente;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContaCorrenteTest {

	@Test
	public void realizaDepositoEmContaCorrente() {
		
		double valorDeposito = 200.0;
		double saldoEsperado = 200.0;
		ContaCorrente cc = new ContaCorrente();
		
		cc.depositar(valorDeposito);
		
		double saldoDaConta = cc.consultaSaldo();
		
		assertEquals(saldoEsperado, saldoDaConta, 0.0001);
		
	}
	
	@Test
	public void realizaSaqueEmContaCorrente() {
		
		double valorDeposito = 200.0;
		double valorSaque = 100.0;
		double saldoEsperado = 100.0;
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.depositar(valorDeposito);
		cc.sacar(valorSaque);
		
		double saldoDaConta = cc.consultaSaldo();
		
		assertTrue(saldoDaConta == 100.0);
		assertEquals(saldoEsperado, saldoDaConta, 0.0001);
		
	}
	
	@Test
	public void realizaTransferenciaEmContaCorrente() {
		
		double valorDeposito1 = 50.0;
		double valorDeposito2 = 200.0;
		double valorTransferencia = 50.0;
		double saldoEsperadoConta1 = 100.0;
		double saldoEsperadoConta2 = 150.0;
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(valorDeposito1);
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.depositar(valorDeposito2);
		
		cc2.transfere(cc1, valorTransferencia);
		
		double saldoDaConta1 = cc1.consultaSaldo();
		double saldoDaConta2 = cc2.consultaSaldo();
		
		assertTrue(saldoEsperadoConta1 == saldoDaConta1);
		assertTrue(saldoEsperadoConta2 == saldoDaConta2);
				 		
		assertEquals(saldoEsperadoConta1, saldoDaConta1, 0.0001);
		assertEquals(saldoEsperadoConta2, saldoDaConta2, 0.0001);
	}
	
	@Test
	public void realizaConsultaSaldo(){				
		System.out.println("Responda - Faz sentido testar esse método?");
	}

}
