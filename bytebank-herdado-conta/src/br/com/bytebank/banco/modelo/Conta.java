package br.com.bytebank.banco.modelo;

public abstract class Conta extends Object implements Comparable<Conta>{

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		
		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia inválida!");
		}
		
		if (numero < 1) {
			throw new IllegalArgumentException("Número de conta inválido!");
		}
		
		Conta.total++;
//		System.out.println("Conta " + Conta.total + " aberta com sucesso!");
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
//		System.out.println("Número da conta: " + this.numero);
//		System.out.println();
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta conta = (Conta) ref;
		
		if (this.agencia != conta.agencia) {
			return false;
		} 
		
		if (this.numero != conta.numero) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public int compareTo(Conta conta) {
		return Double.compare(this.saldo, conta.saldo);
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}

}