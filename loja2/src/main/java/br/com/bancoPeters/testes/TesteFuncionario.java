package br.com.bancoPeters.testes;

import br.com.bancoPeters.contas.Funcionario;
import br.com.bancoPeters.contas.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("222222");
		nico.setSalario(5000.0);

		System.out.println(nico.getBonificacao());

	}

}
