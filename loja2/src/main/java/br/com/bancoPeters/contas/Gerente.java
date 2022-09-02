package br.com.bancoPeters.contas;

// Gerente herda a classe funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	public void setSenha(int valor) {
		this.senha = senha;
	}
	
	public boolean autenticaca(int senha) {
		if(this.senha == senha) {
			return true;
		}else System.out.println("Senha incorreta");
		return false;
	}

	@Override
	public double getBonificacao() {
		return 0;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
	

	
	
}
