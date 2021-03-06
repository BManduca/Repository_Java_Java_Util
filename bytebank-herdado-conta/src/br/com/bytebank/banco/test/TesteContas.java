package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 1234);
		cc.deposita(100.0);
		
		
		ContaPoupanca cp = new ContaPoupanca(112, 5689);
		cp.deposita(150.0);
		
		System.out.println("Conta corrente: ");
		System.out.println("Agência: " + cc.getAgencia());
		System.out.println("Número da conta: " + cc.getNumero());
		System.out.println("Valor do depósito: " + cc.getSaldo());
		System.out.println();
		System.out.println("Conta poupança: ");
		System.out.println("Agência: " + cp.getAgencia());
		System.out.println("Número da conta: " + cp.getNumero());
		System.out.println("Valor do depósito: " + cp.getSaldo());
		System.out.println();
		System.out.println("Efetuando uma transferência: ");
		cc.transfere(20.0, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		System.out.println();
		System.out.println("Efetuando um saque da Conta Corrente: ");
		cc.saca(10.0);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		

	}

}
