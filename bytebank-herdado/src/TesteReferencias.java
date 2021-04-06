
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Brunno");
		g1.setSalario(3000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Felipe");
		ev.setSalario(2000.0);
		
		Designer d = new Designer();
		d.setNome("Gabriela");
		d.setSalario(3200.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("Salario: " + g1.getSalario());
		System.out.println("Bonificacao: " + g1.getBonificacao());
		controle.registra(g1);
		System.out.println();
		System.out.println("Nome: " + ev.getNome());
		System.out.println("Salario: " + ev.getSalario());
		System.out.println("Bonificacao: " + ev.getBonificacao());
		controle.registra(ev);
		System.out.println();
		System.out.println("Nome: " + d.getNome());
		System.out.println("Salario: " + d.getSalario());
		System.out.println("Bonificacao: " + d.getBonificacao());
		controle.registra(d);
		System.out.println();
		System.out.println("Bonificação Geral: " + controle.getTotal());

	}

}
