package br.com.fernandonkgw.oo;

import org.junit.Assert;
import org.junit.Test;


public class PagamentosTest {

	@Test
	public void deveDescontar8QuandoValorEhMaiorQue100() {
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		pagamento1.setValor(105);
		pagamento2.setValor(25);
		
		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);
		
		Assert.assertEquals(122.0, pagamentos.getValorPago(), 0.0001);
	}
}
