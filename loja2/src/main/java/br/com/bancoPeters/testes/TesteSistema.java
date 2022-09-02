package br.com.bancoPeters.testes;

import br.com.bancoPeters.contas.Gerente;
import br.com.bancoPeters.contas.SistemaInterno;

public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(g);

	}

}
