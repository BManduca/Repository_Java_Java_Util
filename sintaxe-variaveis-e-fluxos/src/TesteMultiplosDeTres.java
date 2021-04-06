
public class TesteMultiplosDeTres {

	public static void main(String[] args) {
		
		int total = 100;
		
		System.out.println("Os múltiplos de 3 são: ");
		for (int valor = 0; valor <= total; valor++) {
			if (valor % 3 == 0) {
				
				/*System.out.println("O valor " + valor + " é múltiplo de 3!");*/
				System.out.println(valor);
				System.out.println();
				
			} /*else {
				System.out.println("O valor " + valor + " não é múltiplo de 3!");
				System.out.println();
			}*/
			
			
			/*
			 * uma maneira alternativa
			 * 
			 * for (int i = 3; i < 100; i += 3 ){
		            System.out.println(i);
		        }
			 * */
		}

	}

}
