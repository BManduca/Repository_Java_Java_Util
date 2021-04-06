
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente clt = new Cliente();
		clt.setSenha(5678);
		
		
		SistemaInterno si = new SistemaInterno();
		System.out.println("Senha do Gerente: ");
		si.autentica(g);
		System.out.println();
		System.out.println("Senha do Administrador: ");
		si.autentica(adm);
		System.out.println();
		System.out.println("Senha do Cliente: ");
		si.autentica(clt);

	}

}
