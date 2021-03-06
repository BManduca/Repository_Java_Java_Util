package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//array list somente de conta
		//<tipo de referencia> -> generics, codigo mais tipado e mais seguro
		//Collection<Conta> lista = new ArrayList<Conta>();
		
		/*
		 * ao colocarmos de maneira mais generica, ou seja, 
		 * alterando de ArrayList, LinkedList ou Vector para 
		 * Collections, algumas linhas param 
		 * de compilar, justamente os métodos que 
		 * usam a posição, como remove() ou get(). Isto ocorre, pois, 
		 * apenas listas são sequências e possuem um índice, mas há outras
		 * coleções que funcionam sem índice e consequentemente, não 
		 * possuem esses métodos.
		 * */
		
		List<Conta> lista = new ArrayList<Conta>();
		//ArrayList<String> nomes = new ArrayList<String>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
        //nao precisa mais do type cast
        //Conta ref = (Conta) lista.get(0);
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());
        System.out.println();

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);
        
        // Para acessar cada um destes elementos, 
        //dentro de um laço, ou seja, fazer a iteração deles, utilizando um for.
        for(int i=0; i < lista.size(); i++) {
        	Object oRef = lista.get(i);
        	System.out.println(oRef);
        }
        
        System.out.println("--------------------");
        
        //outra maneira de acessar estes elementos...
        //Para cada elemento do tipo Object desta lista, queremos que seja impresso o seu valor:
        for(Conta conta: lista) {
        	System.out.println(conta);
        }

	}

}
