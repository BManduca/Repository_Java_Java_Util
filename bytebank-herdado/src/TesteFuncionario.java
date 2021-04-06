import java.text.DecimalFormat;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		
		//para corrigir o erro de compilação, basta trocar a referencia genérica do tipo Funcionario
		//colocando por exemplo Gerente
		//Funcionario brunno = new Gerente();
		Gerente brunno = new Gerente();
		
		brunno.setNome("Brunno Manduca");
		brunno.setCpf("083540479-03");
		brunno.setSalario(2500.80);
		
		System.out.println("Nome: " + brunno.getNome());
		System.out.println("CPF: " + brunno.getCpf());
		System.out.println("Salário: " + brunno.getSalario());
		System.out.println("Bonificação: " + formatador.format(brunno.getBonificacao()));
		
	}
	
}
