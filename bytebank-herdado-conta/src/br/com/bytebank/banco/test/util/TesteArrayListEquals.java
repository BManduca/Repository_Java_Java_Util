package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 11);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		//array list somente de conta
		//<tipo de referencia> -> generics, codigo mais tipado e mais seguro
		//pode ser utilizado ArrayList, LinkedList e o Vector -> so foi alterado a implementação
		//o restante permaneceu igual... esse é o poder do polimorfismo..
		List<Conta> lista = new Vector<Conta>(); //thread safe

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println();
        Conta ref = lista.get(0);
        
        System.out.println("Numero da conta: " + ref.getNumero());
        System.out.println();
        
        lista.remove(0);
        
        System.out.println("Tamanho da lista: " + lista.size());
        
        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);
        
        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);
        
        boolean existe = lista.contains(cc3);
        System.out.println();
        System.out.println("Já existe? " + existe);
        System.out.println();
        
        for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
        
        System.out.println("--------------------------------");
        
        //outra maneira de acessar estes elementos...
        //Para cada elemento do tipo Object desta lista, queremos que seja impresso o seu valor:
        for(Conta conta: lista) {
        	System.out.println(conta);
        }

	}

}
