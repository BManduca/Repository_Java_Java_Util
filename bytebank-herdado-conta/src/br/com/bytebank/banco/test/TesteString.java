package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String namePlataforma = "     Alura    ";
		// trim() -> remover espaços em branco nas váriavel. 
		String anotherName = namePlataforma.trim();
		
		System.out.println(namePlataforma.contains("Alu"));
		System.out.println(anotherName);
		
		String nome = "Alura"; //object literal
		//String another = new String("Alura");
		
		
		System.out.println();
		System.out.println(nome.length());
		System.out.println();
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		/*String sub = nome.substring(1);
		System.out.println(sub);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		char c = nome.charAt(0);
		System.out.println(c);
		
		char c = 'A';
		char d = 'a';
		
		String outra = nome.replace(c, d);
		
		//String outra = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outra);*/

	}

}
