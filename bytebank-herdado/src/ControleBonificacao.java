
public class ControleBonificacao {

	private double total;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.total = this.total + boni;
	}

	public double getTotal() {
		return total;
	}
	
}
