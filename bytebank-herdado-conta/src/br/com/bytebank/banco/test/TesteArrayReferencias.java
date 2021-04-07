package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		//array generico
		Object[] referencias = new Object[5];
		Conta[] contas = new Conta[5];
		
		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		contas[1] = cc2;
		
		ContaPoupanca cp1 = new ContaPoupanca(33, 44);
		contas[2] = cp1;
		
		
//		Object referenciaGenerica = referencias[3];
//		
//		System.out.println(referenciaGenerica.getNumero());
//		
//		System.out.println("Número da conta: " + referencias[1].getNumero());
		
		Conta ref = contas[0];
		//fazendo um cast ou typecast, assumindo como desenvolvedor que isso funcionará.
		ContaPoupanca ref2 = (ContaPoupanca) referencias[2];
		
		System.out.println("Número da conta: " + ref.getNumero());
//		System.out.println("Número da conta: " + referencias[2].getNumero() + 
//				" - Agencia " + referencias[2].getAgencia());
		
	}

}
