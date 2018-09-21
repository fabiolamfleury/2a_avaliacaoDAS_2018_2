package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.AplicacaoCDB;

class CalculoImpostoRendaTeste {
	@Test
	void testImpostoRenda() {
		AplicacaoCDB aplicacao = new AplicacaoCDB(60, 1000.00F, 8.5F);
		
		assertEquals(3.14F, aplicacao.getValorImpostoRenda(), 0.01F);
	}

	@Test
	void testOutroImpostoRenda() {
		AplicacaoCDB aplicacao = new AplicacaoCDB(120, 500, 8);
		
		assertEquals(2.96F, aplicacao.getValorImpostoRenda(), 0.01F);
	}
}
