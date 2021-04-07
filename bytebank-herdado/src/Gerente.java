
/* Gerente é um funcionario, Gerente herda da class Funcionario, assina contrato Autenticavel, pois ele é um Autenticavel. */

public class Gerente extends Funcionario implements Autenticavel{
	
	//utilizando modificador public, para que o método tenha visibilidade pública
	//bonificação para gerente é o próprio valor do salário.
	
	private Autenticador autenticador;

	public double getBonificacao() {
		//return super.salario;
		/*
		 * para melhorar a escrita do nosso codigo e evitar esse mal uso
		 * 
		 * faremos novamente referencia a super classe e chamaremos 
		 * o proprio metodo para retornar o salario
		 * */
		return super.getSalario();
	}


	//constructor
		public Gerente() {
			this.autenticador = new Autenticador();
		}
		
		
		@Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
		}

		@Override
		public boolean autentica(int senha) {
			return this.autenticador.autentica(senha);
		}


}
