package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

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
            
            System.out.println("----------------------------------------------------------");
            
            // "->" sintaxe dos lambdas
            // foi definido a entrada e a seta defini o codigo está associado com a entrada 
            lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
            System.out.println("Ordenando pelo número da conta: ");
            lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
            System.out.println("----------------------------------------------------------");
            System.out.println();
            
            Comparator<Conta> comp = 
            		(Conta c1, Conta c2) -> {
            			String nomeC1 = c1.getTitular().getNome();
            			String nomeC2 = c2.getTitular().getNome();
            			return nomeC1.compareTo(nomeC2);
            		};
            		
            lista.sort(comp);
            System.out.println("----------------------------------------------------------");
            System.out.println("Ordenando pelo nome do titular: ");
            lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
            System.out.println("----------------------------------------------------------");
            
    }

}





