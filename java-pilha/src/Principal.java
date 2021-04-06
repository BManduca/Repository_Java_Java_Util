
public class Principal {

	public static void main(String[] args) {
		
		String nome = "Brunno";
		System.out.println("ANTES");
		
		try {
			System.out.println(nome);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("CATCH");
		}
		System.out.println("DEPOIS");
		
		try {
			System.out.println();
		    System.out.println(1/0);
		} catch(ArithmeticException | NullPointerException ex) {
		    ex.printStackTrace();
		}
	}

}
