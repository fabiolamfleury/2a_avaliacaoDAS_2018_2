package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.AplicacaoCDB;

class CalculoImpostoRendaTeste {
	@Test
	void test() {
		AplicacaoCDB aplicacao = new AplicacaoCDB(60, 1000.00F, 8.5F);
		
		assertEquals(3.14F, aplicacao.getValorImpostoRenda());
	}

}
