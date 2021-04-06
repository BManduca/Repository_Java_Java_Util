import java.text.DecimalFormat;

public class TestaPontosFlutuantes {

	public static void main(String[] args) {
		
		//DecimalFormat formatador = new DecimalFormat("0.00");
		
		double salario = 1250.70;
		
		System.out.println("O Salário é " + salario);
		
		double salarioanual = 1250.70 * 12;
		
		System.out.printf("Minha base salarial anual é: %.2f %n", salarioanual);
		
		//System.out.println("Minha base salarial anual é: " + formatador.format(salarioanual));
		
		double divisao = 3.14 / 2;
		
		System.out.println("Resultado da divisão: " + divisao);
		
		double outraDivisao = 5 / 2;
		
		System.out.println("Resultado da divisão: " + outraDivisao);
		
		/*
		 * Aqui o próprio java pegara o de "maior valor", fazendo a comparação entre 
		 * um double e um int e assim fará a conta.  como podemos ver ele usou o double e efetuou a conta
		 * resultando em um double
		 * 
		 * se fosse no caso de cima o resultado seria um int, pois, tanto o numerador quanto 
		 * o denominador são inteiros.
		 * */
		double novaDivisao = 5.0 / 2;
		
		System.out.println("Resultado da divisão: " + novaDivisao);

	}

}
