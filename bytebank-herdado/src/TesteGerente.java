
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Rafael");
		g1.setCpf("05446985236");
		g1.setSalario(5000.00);
		
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println("Nome " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salário: " + g1.getSalario());
		System.out.println("Bonificação: " + g1.getBonificacao());
		System.out.println(autenticou);

	}

}
