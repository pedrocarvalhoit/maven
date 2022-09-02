package br.com.bancoPeters.testes;

import br.com.bancoPeters.contas.Autenticavel;
import br.com.bancoPeters.contas.Gerente;

public class TesteGerente {

	public static void main(String[] args) {

		Autenticavel referencia = new Gerente();
		
		
		Gerente g1 = new Gerente();
		g1.setNome("pedro");
		g1.setCpf("124124124");
		g1.setSalario(5000.0);
		g1.setSenha(505050);
		
		System.out.println(g1.getNome());
		
		g1.setSenha(123456);
		boolean autenticou = g1.autenticaca(505050);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
