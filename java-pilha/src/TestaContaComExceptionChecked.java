
public class TestaContaComExceptionChecked {

	public static void main(String[] args) throws MyException {
		
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MyException mex) {
			System.out.println("Tratamento de conta com Exception...");
		}
		
	}

}
