
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		
		System.out.println("Letra: " + letra);
		
		char valor = 66;
		
		System.out.println("Letra: " + valor);
		
		valor = (char)(valor + 1);
		
		System.out.println("Letra: " + valor);
		
		/*
		 * para caracteres em Java é utilizado o tipo String, 
		 * o char é mais voltado para guardar um único caractere de 16bits
		 * 
		 * String Ela não é palavra chave do Java, não guarda valor, é um tipo referência
		 * */
		
		String texto = "Alura - cursos online de tecnologia";
		String ano = " para o ano de 2021";
		
		System.out.println("Texto: " + texto + ano);

	}

}
