
public class TestaConversao {

	public static void main(String[] args) {
		
		//alem do double, existe o float
		//para o java 3.14 é um double que é 64 bits e float é 32 bits, então perderia informação.
		float pontoFlutuante = 3.14f;
		
		
		double salario = 1270.50;
		//efetuando um casting ou uma conversão, somente é realizado
		//quando não é possível fazer de maneira automática
		int valor = (int) salario;
		
		System.out.println("Salario = " + valor);
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		
		double total = valor1 + valor2;
		
		System.out.println("Total = " + total);

	}

}
