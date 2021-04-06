
public class FluxoComError {

	public static void main(String[] args) {
	    System.out.println("Ini do main");
	    try {
	        metodo1();
	    //} catch(ArithmeticException | NullPointerException | MyException ex) {
        // catch genérico
	    } catch(Exception ex) {
	        String msg = ex.getMessage();
	        System.out.println("Exception --> " + msg);
	        ex.printStackTrace();
	    } 
	    System.out.println("Fim do main");
	}

    private static void metodo1() throws Exception {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws Exception {
    	System.out.println("ini do metodo 2");
    	throw new ArithmeticException("Algo de errado aconteceu...");
        //metodo2();
        //System.out.println("fim do metodo 2");
    }
}