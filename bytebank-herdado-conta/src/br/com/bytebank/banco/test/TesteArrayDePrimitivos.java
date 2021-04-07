package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
	
	//array -> []
	public static void main(String[] args) {
		
		/*
		 * Arrays
		 * -> int idades[] ou int[] idades
		 * */
		
		//o array inicializa cada posicao com 0
		int idades[] = new int[5];
		/*
		idades[0] = 29;
		idades[1] = 15;
		idades[2] = 40;
		idades[3] = 60;
		idades[4] = 85;
		int idade4 = idades[4];
		
		System.out.println("Idade4 = " + idade4);
		System.out.println("Tamanho do array idades = " + idades.length);*/
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idade[" + i + "] = " + idades[i]);
		}
				
	}

}
