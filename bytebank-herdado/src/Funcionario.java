
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//protected -> ser visivel para as classes filhas
	//protected double salario;
	private double salario;
	
	//utilizando modificador public, para que o método tenha visibilidade pública
	/*precisamos garantir que este método exista para as classes filhas. Ele precisa existir, para que 
	o ControleBonificacao() funcione. Entretanto, seria ideal que ele não viesse com uma implementação, 
	ou seja, que existisse da seguinte forma:*/
	
	//porém, getBonificacao() é um método concreto e para que isso funcione, declararemos ele como abstrato
	//método sem 'corpo', não há implementação.. a implementação é feita nos filhos
	public abstract double getBonificacao();
	
	/*public double getBonificacao() {
		return this.salario * 0.1;
	}*/
	
	
	//constructor.. caso não seja definido nenhum constructor, o compilador criará automaticamente.
	/*public Funcionario() {
		
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
