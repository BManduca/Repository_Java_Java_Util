package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteIterator {

	public static void main(String[] args) {
		//List<String> nomes = new ArrayList<>();
		Set<String> nomes = new HashSet<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
		  System.out.println("Personagem: " + it.next());
		}

	}

}
