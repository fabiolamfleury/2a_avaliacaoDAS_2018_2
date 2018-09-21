package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.AplicacaoCDB;

class CalculoRendimentoLiquidoTeste {

	@Test
	void test() {
		AplicacaoCDB aplicacao = new AplicacaoCDB(60, 1000.00F, 8.5F);
		
		assertEquals(1.0829F, aplicacao.getRendimentoLiquido());
	}


}
