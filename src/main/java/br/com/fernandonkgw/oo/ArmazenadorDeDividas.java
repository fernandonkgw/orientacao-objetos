package br.com.fernandonkgw.oo;

public interface ArmazenadorDeDividas {

	public void salva(Divida divida);
	public Divida carrega(Documento documentoCredor);
}
