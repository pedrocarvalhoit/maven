package br.com.bancoPeters.contas;


public class EditordeVideo extends Funcionario{
	
	private int senha;
	
	public void setSenha(int valor) {
		this.senha = senha;
	}
	
	public boolean autenticacao(int senha) {
		if(this.senha == senha) {
			return true;
		}else;
			return false;
	
			
		
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
