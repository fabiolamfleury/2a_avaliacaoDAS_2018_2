package tests;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import model.AplicacaoCDB;

@RunWith(Parameterized.class)
public class CalculoRendimentoBrutoTest {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { {60, 1000.00F, 8.5F, 13.97F}, 
											  {120, 500, 8, 13.15F},
											  {1000,100.00F, 7.5F, 20.55F}});
	}

	@Parameter
	public int dias;

	@Parameter(1)
	public float aplicacaoInicial;

	@Parameter(2)
	public float jurosAnual;

	@Parameter(3)
	public float rendimentoBrutoEsperado;

	@Test()
	public void testRendimentoBruto() {
		AplicacaoCDB aplicacao = new AplicacaoCDB(dias, aplicacaoInicial, jurosAnual);

		assertEquals(rendimentoBrutoEsperado, aplicacao.getRendimentoBruto(), 0.01F);
	}

}


