package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.AplicacaoCDB;

class CalculoRendimentoBrutoTeste {

	@Test
	void testCalculoRendimentoBruto() {
		AplicacaoCDB aplicacao = new AplicacaoCDB(60, 1000.00F, 8.5F);
		
		assertEquals(13.97F, aplicacao.getRendimentoBruto());
	}

	@Test
	void testOutroCalculoRendimentoBruto() {
		AplicacaoCDB aplicacao = new AplicacaoCDB(120, 500, 8);
		
		assertEquals(13.15F, aplicacao.getRendimentoBruto());
	}
}
