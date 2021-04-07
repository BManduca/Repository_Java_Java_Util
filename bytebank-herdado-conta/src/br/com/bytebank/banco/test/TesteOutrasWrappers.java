package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrasWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //Autoboxing
		System.out.println("Integer = " + idadeRef.intValue()); //Unboxing
		
		//Double doubleRef = 3.2;
		Double doubleRef = Double.valueOf(3.2); // Autoboxing
		System.out.println("Double = " + doubleRef.doubleValue()); // Unboxing
		
		Boolean booleanRef = Boolean.TRUE;
		System.out.println("Boolean = " + booleanRef.booleanValue());
		
		Number refNumero = Integer.valueOf(45); //Double, float...
		
		List<Number> lista = new ArrayList<>();
		
		lista.add(18);
		lista.add(33.5);
		lista.add(98.5f);
		
	}

}
