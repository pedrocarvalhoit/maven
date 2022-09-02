package br.com.bancoPeters.contas;


public class SistemaInterno {
	
	int senha = 2222;
	
	public void autentica(Gerente g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		}else {
			System.out.println("Não pode entrar");
		}
	}
	

}
