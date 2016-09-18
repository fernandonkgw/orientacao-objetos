package br.com.fernandonkgw.oo;

public class Cpf implements Documento {

	private final String valor;

	public Cpf(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cpf other = (Cpf) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	public boolean ehValido() {
		return primeiroDigitoVerificadoEstaCorreto()
				&& segundoDigitoVerificadorEstaCorreto();
	}

	private boolean primeiroDigitoVerificadoEstaCorreto() {
		// Calcula o primeiro digito verificador do CPF se
		// ele estiver correto e compara com o valor preenchido
		return true;
	}

	private boolean segundoDigitoVerificadorEstaCorreto() {
		// Calcula o segundo digito verificador do CPF se
		// ele estiver correto e compara com o valor preenchido
		return true;
	}
}
