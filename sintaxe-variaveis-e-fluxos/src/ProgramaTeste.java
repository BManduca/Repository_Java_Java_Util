
public class ProgramaTeste {

	public static void main(String[] args) {
		
		int contador = 1;
		
		while (contador <= 10) {
			System.out.println("Posição[" + contador + "] -> " + contador);
			contador++; //se não fizer a incrementação da variavel, acabará caindo em um loop infinito.
		}
		System.out.println("Fim do While!");
	}

}
