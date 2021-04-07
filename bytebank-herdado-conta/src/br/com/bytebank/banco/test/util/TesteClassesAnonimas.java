package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteClassesAnonimas {

    public static void main(String[] args) {

            Conta cc1 = new ContaCorrente(22, 33);
            Cliente clienteCC1 = new Cliente();
            clienteCC1.setNome("Brunno");
            cc1.setTitular(clienteCC1);
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(22, 44);
            Cliente clienteCC2 = new Cliente();
            clienteCC2.setNome("João");
            cc2.setTitular(clienteCC2);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(22, 11);
            Cliente clienteCC3 = new Cliente();
            clienteCC3.setNome("Lucas");
            cc3.setTitular(clienteCC3);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(22, 22);
            Cliente clienteCC4 = new Cliente();
            clienteCC4.setNome("Maria");
            cc4.setTitular(clienteCC4);
            cc4.deposita(222.0);


            List<Conta> lista = new ArrayList<>();
            lista.add(cc1);
            lista.add(cc2);
            lista.add(cc3);
            lista.add(cc4);
            
            System.out.println("-----------------------------");
            
            //criação de um objeto para encapsular a execução do método compare
            //Function Objects
            //NumeroDaContaComparator2 comparator = new NumeroDaContaComparator2();
            //lista.sort(new NumeroDaContaComparator2());
            
          //criando por debaixo dos panos um obj compativel
            //com o compare
            
            //classe anonima
            lista.sort(new Comparator<Conta>() {
            	
	            	//classe sem atributos
	            	
	            	
	            	//metodo compara não usa this e so encapsula o trecho de codigo presente 
            		//abaixo
	                @Override
	                public int compare(Conta c1, Conta c2) {
	                    return Integer.compare(c1.getNumero(), c2.getNumero());
	                }
	            }
            );
            
            Comparator<Conta> comp = new Comparator<Conta>() {

            	@Override
            	public int compare(Conta c1, Conta c2) {
            		
            		String nomeC1 = c1.getTitular().getNome();
            		String nomeC2 = c2.getTitular().getNome();
            		return nomeC1.compareTo(nomeC2);
            	}

            };
            
            for (Conta conta : lista) {
            	System.out.println(conta + ", " + conta.getTitular().getNome());
            }
            System.out.println("-----------------------------");
            
    }

}





