
public class TestaCondicional2 {

	public static void main(String[] args) {
		
		System.out.println("Testando os condicionais..");
		
		/*
		 * Os operadores lógicos devem ter no lado esquerdo e direito uma expressão booleana.
		 * 
		 * O operador lógico AND é representado pelos caracteres && e o OR pelo ||.
		 * */
		
		int idade = 20;
		int quantidadePessoas = 2;
		//existe no java também o tipo de variável boolean, que so recebe valores true ou false
		boolean acompanhado = quantidadePessoas >= 2;
		
		/*
		 * como condicionais booleanos existem o 
		 * 'e' -> && e o 'ou' -> &&
		 * 
		 * com o 'e' -> ambas as situações tem que dar true, pra passar
		 * com o 'ou' -> somente uma das situações pode ser true, que irá passar
		 * */
		System.out.println("Acompanhado? " + acompanhado);
		//if (idade >= 18 || quantidadePessoas >= 2) {
		if (idade >= 18 || acompanhado) {
			System.out.println("Documento e idade conferida..");
			System.out.println("Seja Bem-vindo!");
		} else {
			/*if (quantidadePessoas > 2) {
				System.out.println("Você ainda não tem dezoito, porém, está acompanhado de pessoas que "
						+ "são maiores de idade.");
				System.out.println("Então, seja Bem-Vindo!");
			} else {*/
				System.out.println("Você é menor de idade, aguarde o momento certo..!");
			/*}*/
		}
		
		
		
	}

}
