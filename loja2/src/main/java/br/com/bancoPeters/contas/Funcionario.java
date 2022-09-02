package br.com.bancoPeters.contas;


public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//metodo sem corpo,não há implementação.
	public abstract double getBonificacao();
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
}

