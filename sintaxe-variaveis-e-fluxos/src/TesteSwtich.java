
public class TesteSwtich {

	public static void main(String[] args) {
		
		int mes = 12;
		
		//O break irá interromper a execução do caso que o contém,
		//para os outros não serem executados
		switch (mes) {
			case 1:
				System.out.println("Mês " + mes + " é correspondente a Janeiro.");
				break;
			case 2:
				System.out.println("Mês " + mes + " é correspondente a Fevereiro.");
				break;
			case 3:
				System.out.println("Mês " + mes + " é correspondente a Março.");
				break;
			case 4:
				System.out.println("Mês " + mes + " é correspondente a Abril.");
				break;
			case 5:
				System.out.println("Mês " + mes + " é correspondente a Maio.");
				break;
			case 6:
				System.out.println("Mês " + mes + " é correspondente a Junho.");
				break;
			case 7:
				System.out.println("Mês " + mes + " é correspondente a Julho.");
				break;
			case 8:
				System.out.println("Mês " + mes + " é correspondente a Agosto.");
				break;
			case 9:
				System.out.println("Mês " + mes + " é correspondente a Setembro.");
				break;
			case 10:
				System.out.println("Mês " + mes + " é correspondente a Outubro.");
				break;
			case 11:
				System.out.println("Mês " + mes + " é correspondente a Novembro.");
				break;
			case 12:
				System.out.println("Mês " + mes + " é correspondente a Dezembro.");
				break;
			default:
				System.out.println("Mês inserido é inválido!");
				break;
		}
		
	}

}
