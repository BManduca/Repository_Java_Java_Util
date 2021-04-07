
public class TestaLacos {

	public static void main(String[] args) {
		
		int resultado = 0;
		
		System.out.println("--------------------");
		for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
			System.out.println("Tabuada do " + multiplicador + ": ");
			for (int contador = 0; contador <= 10; contador++) {
				
				resultado = multiplicador * contador;
				
				System.out.println(multiplicador + " x " + contador + " = " + resultado);
				
			}
			System.out.println("--------------------");
		}
		
	}

}
