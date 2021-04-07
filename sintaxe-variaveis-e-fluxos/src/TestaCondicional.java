
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 17;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("Documento e idade conferida..");
			System.out.println("Seja Bem-vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você ainda não tem dezoito, porém, está acompanhado de pessoas que "
						+ "são maiores de idade.");
				System.out.println("Então, seja Bem-Vindo!");
			}else {
				System.out.println("Você é menor de idade, aguarde o momento certo..!");
			}
		}

	}

}
