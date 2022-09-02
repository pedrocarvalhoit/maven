package br.com.bancoPeters.testes;

import br.com.bancoPeters.contas.ControleBonificatorio;
import br.com.bancoPeters.contas.EditordeVideo;
import br.com.bancoPeters.contas.Funcionario;
import br.com.bancoPeters.contas.Gerente;

public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		String nome = g1.getNome();
		g1.setSalario(5000.0);
		
		Funcionario g2 = new Gerente();
		g1.setSalario(2000.0);
		
		Funcionario ev1 = new EditordeVideo();
		ev1.setSalario(1000.0);
		
		ControleBonificatorio controle = new ControleBonificatorio();
		controle.registra(g1);
		controle.registra(g2);
		controle.registra(ev1);
		
		System.out.println(controle.getSoma());
		
		
	}

	
}
