
public class TesteFatorial {

	public static void main(String[] args) {
		
		int maxFatorial = 10;
		int fatorial = 1;
		
		for (int contador = 1; contador <= maxFatorial; contador++) {
			
			fatorial *= contador;
			System.out.println("Fatorial [" + contador + "] = " + fatorial);
			
		}
		
	}

}
