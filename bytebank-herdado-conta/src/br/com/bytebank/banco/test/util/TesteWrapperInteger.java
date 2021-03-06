package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		//int idade = 29; // classe Integer
		
		//Integer idadeRef = new Integer(29); // -> constructor deprecated
		
		//para criar um objeto neste caso, é utilizado a classe em si(Integer)
		//com método estático valueOf(), que recerá o primitivo
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		int valor = idadeRef.intValue(); //unboxing
		int primitivo = new Integer(45);
		
		System.out.println(valor);
		System.out.println();
		System.out.println("Double = " + idadeRef.doubleValue());
		System.out.println();
		System.out.println("Max_Value = " + Integer.MAX_VALUE);
		System.out.println();
		System.out.println("Min_Value = " + Integer.MIN_VALUE);
		System.out.println();
		
		//retorna o valor "10", porém o 10 esta como uma string
		//para saber o valor inteiro, podemos utilizar a classe Integer, 
		//para converter de string para inteiro
		String s = args[0]; 
		
		//Integer numero = Integer.valueOf(s);
		//outra maneira de fazer essa transformação:
		int numero = Integer.parseInt(s);
		double raio = 5;
		double area = (Math.PI)*raio*raio;
		double diametro = 2 * raio;
		double circunferencia = (Math.PI) * diametro;
		
		
		//parsing -> programa foi capaz de transformar uma string em um inteiro
		System.out.println("Conversão String|Número -> " + numero);
		
		System.out.println("--------------------------------------------------");
		System.out.println("Área = " + area);
		System.out.println();
		//d = 2r
		System.out.println("Diâmetro = " + diametro);
		System.out.println();
		//C = πd | o comprimento do arco de um semicirculo, sempre será (πd)/2 ou πr 
		System.out.println("Circunferência = " + circunferencia);
		System.out.println("--------------------------------------------------");
		
		List<Integer> numeros = new ArrayList<>();
        numeros.add(29); //Autoboxing
        
        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); //Autoboxing
        lista.add(primitivo); //Autoboxing
        
        int i1 = lista.get(0); //unboxing
        Integer i2 = lista.get(1);
        
        System.out.println("Primeiro valor = " + i1);
        System.out.println();
        System.out.println("Segundo valor = " + i2);
        System.out.println("--------------------------------------------------");
        
        Integer valorRef = Integer.valueOf(33);
        int valorPri = valorRef.intValue(); //desembrulhando, pegando o vaor primitivo do obj wrapper
        
        System.out.println("Valor Primitivo = " + valorPri);
        
        System.out.println("--------------------------------------------------");
        
        Integer iParseado1 = Integer.valueOf(42); //parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44"); //parseando e devolvendo primitivo
        
        System.out.println("Referencia = " + iParseado1);
        System.out.println();
        System.out.println("Primitivo = " + iParseado2);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE); //2 ^ 31 - 1
        System.out.println("MIN_VALUE = " + Integer.MIN_VALUE); // -2 ^ 31
        System.out.println("SIZE = " + Integer.SIZE); // 32 bits
        System.out.println("BYTES = " + Integer.BYTES); // 4 bytes
        
        System.out.println("--------------------------------------------------");
		
	}

}
