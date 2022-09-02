package br.com.bancoPeters.contas;


public class ControleBonificatorio {
	
	private double soma;
	

	public void registra(Funcionario f1) {
		double boni = f1.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

	
	
}
