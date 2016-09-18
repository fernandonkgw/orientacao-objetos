package br.com.fernandonkgw.oo;

import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<Documento, Divida> dividas = new HashMap<>();

	public void registraDivida(Divida divida) {
		dividas.put(divida.getDocumentoCredor(), divida);
	}

	public void pagaDivida(Documento documento, Pagamento pagamento) {
		Divida divida = dividas.get(documento);
		if (divida != null) {
			divida.registra(pagamento);
		}
	}
	
}
