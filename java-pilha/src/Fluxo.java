
public class Fluxo {

	public static void main(String[] args) {
	    System.out.println("Ini do main");
	    try {
	        metodo1();
	    //} catch(ArithmeticException | NullPointerException | MyException ex) {
	    } catch(Exception ex) {
	        String msg = ex.getMessage();
	        System.out.println("Exception --> " + msg);
	        ex.printStackTrace();
	    } 
	    System.out.println("Fim do main");
	}

    private static void metodo1() throws MyException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MyException {
        System.out.println("Ini do metodo2");
        System.out.println("-------------------------");
        
        
        //criação de objeto
        //ArithmeticException exception = new ArithmeticException("deu errado");
        throw new MyException("deu errado");
        
        //System.out.println("-------------------------");
        //System.out.println("Fim do metodo2");
    }
}