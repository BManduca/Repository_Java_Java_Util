
public class TestaFor {

	public static void main(String[] args) {
		
		/*
		 * 
		 * serão criados três "espaços" intercalados por ponto e vírgula, 
		 * e então abriremos e fecharemos as chaves normalmente. 
		 * 
		 * O primeiro espaço é opcional e costuma ter a declaração e inicialização da variável, 
		 * sendo executado apenas uma vez.
		 * 
		 * O segundo espaço é executado todas as vezes e contém a condição booleana para saber se ele deve 
		 * ou não entrar no laço, ou seja, executar a próxima iteração. 
		 * 
		 * O terceiro espaço geralmente é ocupado por aquilo a ser executado ao fim de cada iteração, 
		 * 
		 * */
		for (int contador = 0; contador <= 10; contador++) {
			
			System.out.println("Contador[" + contador + "] é " + contador);
			
		}

	}

}
