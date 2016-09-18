package br.com.fernandonkgw.oo;

public class Cnpj {

	private String valor;
	
	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	private Object segundoDigitoCorreto() {
		// TODO implementar
		return 2;
	}

	private Object segundoDigitoVerificador() {
		// TODO implementar
		return 2;
	}

	private Object primeiroDigitoCorreto() {
		// TODO implementar
		return 1;
	}

	private Object primeiroDigitoVerificador() {
		// TODO implementar
		return 1;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String novoValor) {
		this.valor = novoValor;
	}
}
