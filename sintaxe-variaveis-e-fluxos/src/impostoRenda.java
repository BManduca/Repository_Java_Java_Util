
public class impostoRenda {

	public static void main(String[] args) {
		
		// De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
        // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
        // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

		
		double salario = 40;
		
		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("O IR de 22,5% e pode deduzir na declaração o valor de R$ 636.");
		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println("O IR de 15% e pode deduzir na declaração o valor de R$ 350.");
			} else {
				if (salario >= 1900.0 && salario <= 2800.0) {
					System.out.println("O IR de 7,5% e pode deduzir na declaração o valor de R$ 142.");					
				}
			}
		}

	}

}
