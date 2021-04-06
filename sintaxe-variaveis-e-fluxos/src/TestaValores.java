
public class TestaValores {

	public static void main(String[] args) {
		
		/*passagem de valor*/
		
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10;
		 
		int soma = primeiro + segundo;
		
		//System.out.println("Resultado: " + (primeiro + segundo));
		System.out.println("Resultado: " + soma + ", pois o primeiro valor é " + primeiro + " e o segundo é " + segundo);

	}

}
