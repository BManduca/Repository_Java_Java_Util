package br.com.bytebank.banco.modelo;

//tudo é abstrato dentro de uma interface
// poderia -> public abstract interface Tributavel, até poderia, mas não é necessário
public interface Tributavel {

	public abstract double getValorImposto();
	
}
