package br.com.fernandonkgw.oo;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDividas {

	private Map<Documento, Divida> dividasNoBanco = new HashMap<>();
	
	public BancoDeDados(String endereco, String usuario, String senha) {
		System.out.println("Conectado!");
	}
	
	public void salva(Divida divida) {
		dividasNoBanco.put(divida.getDocumentoCredor(), divida);
	}
	
	public Divida carrega(Documento documento) {
		return dividasNoBanco.get(documento);
	}
	
	public void desconecta() {
		System.out.println("Desconectado!");
	}
}
